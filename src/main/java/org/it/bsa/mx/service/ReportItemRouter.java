package org.it.bsa.mx.service;

import org.apache.log4j.Logger;
import org.it.bsa.mx.domain.CallDetailReport;
import org.it.bsa.mx.domain.CellSiteSectorReport;
import org.it.bsa.mx.domain.RouteItem;
import org.it.bsa.mx.domain.SubscriberReport;

/**
 * Performs routing based on type of report type.
 * Will redirect to the appropriate channel.
 *
 */
public class ReportItemRouter {

	private static final Logger log = Logger.getLogger(ReportItemRouter.class);

	public String routeReportItem(RouteItem reportItem) {
		
		String channel = "";
		if(isSubscriberReport(reportItem)) {
			System.out.println("*** [ReportItemRouter] found a subscriber report ***");
			channel = "subscriberReportChannel";
		}
		else if(isCellSiteSectorReport(reportItem)) {
			System.out.println("*** [ReportItemRouter] found a cell site sector report ***");
			channel = "cellSiteSectorReportChannel";
		}
		else if (isCallDetailReport(reportItem))  {
			System.out.println("*** [ReportItemRouter] found a call detail report");
			channel = "callDetailDataChannel";
		}

		System.out.println("*** [ReportItemRouter] returning channel: " + channel);
		return channel;
   }

	
	private Boolean isCallDetailReport(RouteItem orderItem) {
		return orderItem.getItem() instanceof CallDetailReport;			
	}
	
	private Boolean isSubscriberReport(RouteItem orderItem) {
		return orderItem.getItem() instanceof SubscriberReport;			
	}
	
	private Boolean isCellSiteSectorReport(RouteItem orderItem) {
		return orderItem.getItem() instanceof CellSiteSectorReport;			
	}
	
}
