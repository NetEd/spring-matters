package org.it.bsa.mx.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@ContextConfiguration	// default context name is <ClassName>-context.xml
@RunWith(SpringJUnit4ClassRunner.class)
public class MatterAggregatorTest {

	@Autowired
	MessageChannel inputChannel;
	
	@Autowired
	QueueChannel testChannel;
	
	
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
