package org.it.bsa.mx.service;

import java.util.List;
import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.it.bsa.mx.domain.Matter;
import org.it.bsa.mx.domain.RouteItem;
import org.it.bsa.mx.domain.SubscriberReport;
import org.springframework.integration.splitter.AbstractMessageSplitter;
import org.springframework.messaging.Message;

/**
 * Splits an Matter into it's constituent ReportItems
 *
 */
public class MatterSplitter extends AbstractMessageSplitter{

	private static final Logger log = Logger.getLogger(MatterSplitter.class);

	@Override
	protected Object splitMessage(Message<?> message) {
		
		System.out.println("**** [MatterSplitter] splitMessage invoked with " + message.getPayload().getClass()); //matter
		
		if (message.getPayload() instanceof java.util.List){
			//temp code until unsupported report errors channel is implemented
			List<RouteItem> l = new ArrayList<RouteItem>();
			RouteItem ri = new RouteItem();
			ri.setItem(new SubscriberReport());
			l.add(ri);
			return l;
		}
		
		else {
			
			Matter m = (Matter) message.getPayload();
			List<RouteItem> l = m.getRouteItems();
			return l;
		
		}
		
	}

}
