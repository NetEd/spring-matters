package org.it.bsa.mx.service;

import org.apache.log4j.Logger;
import org.it.bsa.mx.domain.CallDetailRecord;
import org.it.bsa.mx.domain.CellSiteSectorReport;
import org.it.bsa.mx.domain.RouteItem;
import org.it.bsa.mx.domain.SubscriberReport;
import org.it.bsa.mx.jasper.CallDetailReportGenerator;
import org.springframework.messaging.Message;

import java.io.IOException;
import java.util.List;

/**
 * Class invoked by ServiceActivator
 *
 */
public class ReportService {

	private static final Logger log = Logger.getLogger(ReportService.class);
	
	/**
	 * Creates a tower report
	 * @param cssReportItem OrderItem comprising of a report item
	 * @return OrderItem with discount price newly calculated
	 */
	public RouteItem processCellSiteSectorReport(RouteItem cssReportItem){
		
		System.out.println("*** [ReportService] processing cellsitesector Report : ***");
		return cssReportItem;
	
	}

	/**
	 * Creates the subscriber report
	 * @param subscriberReportItem OrderItem comprising of a book item
	 * @return OrderItem with discount price newly calculated
	 */
	public RouteItem processSubscriberReport(RouteItem subscriberReportItem){
		
		System.out.println("*** [ReportService] processing subscriber report : ***");
		System.out.println("*******[ReportService] subscriberReportItem type = " + subscriberReportItem.getClass());
		RouteItem ri = new RouteItem();// do something with this
		return ri;
	
	}
	
	/**
	 * Creates the call detail report
	 * @param subscriberReportItem OrderItem comprising of a book item
	 * @return OrderItem with discount price newly calculated
	 */
	public RouteItem processCallDetailReport(Message<?> message){		

		System.out.println("*** [ReportService] processing call detail report : *** with input=" + message.getClass() );
		CallDetailRecord cdr = (CallDetailRecord) message.getPayload();
		CallDetailReportGenerator gen = new CallDetailReportGenerator();
		try {
			gen.runReport(message);
		}
		catch (IOException ioe)  {
			log.error(ioe);
		}
			RouteItem ri = new RouteItem();// do something with this
		return ri;
		
	}


}
