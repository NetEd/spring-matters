package org.it.bsa.mx.service;

import static org.junit.Assert.*;
import static org.springframework.integration.test.matcher.PayloadMatcher.hasPayload;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.it.bsa.mx.domain.CallDetailReport;
import org.it.bsa.mx.domain.SubscriberReport;
import org.it.bsa.mx.domain.Matter;
import org.it.bsa.mx.domain.RouteItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@ContextConfiguration(locations={"classpath:META-INF/com/matters/test/MatterAggregatorTest-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MatterAggregatorTest {

	
	@Autowired
	MessageChannel findMattersResponseChannel;
	
	@Autowired
	QueueChannel testChannel;
	
	
	@Test
	public void test() {
		
        ArrayList<RouteItem> routeItems = new ArrayList<RouteItem>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		
		//Date ranges will be common to both reports
		LocalDate localFromDate = LocalDate.parse("10/12/2014", formatter);
		LocalDate localToDate = LocalDate.parse("10/12/2016", formatter);
		

		SubscriberReport subReport = new SubscriberReport();
		subReport.setFromDate(localFromDate);
		subReport.setToDate(localToDate);
	    RouteItem subItem = new RouteItem(subReport);
	    routeItems.add(subItem);
		
		
		CallDetailReport cdrReport = new CallDetailReport();
		cdrReport.setFromDate(localFromDate);
		cdrReport.setToDate(localToDate);
	    RouteItem cdrItem = new RouteItem(cdrReport);
	    routeItems.add(cdrItem);
		
		
		Matter m = new Matter();
		m.setRouteItems(routeItems);
		findMattersResponseChannel.send(MessageBuilder.withPayload(m).build());
		Message<?> outMessage = testChannel.receive(0);
		assertNull(outMessage);
	//	assertThat(outMessage, hasPayload("A"));
	//	outMessage = testChannel.receive(0);
	//	assertNull("Only one message expected", outMessage);
		
	}

}



