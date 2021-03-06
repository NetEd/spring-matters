package org.it.bsa.mx.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.it.bsa.mx.domain.Matter;
import org.it.bsa.mx.domain.RouteItem;

/**
 * Receives the collection of order items that have been processed
 * for the discount reduction.
 */
public class MatterAggregator {
	
	private static final Logger log = Logger.getLogger(MatterAggregator.class);

	public Matter prepareDelivery(List<RouteItem> orderItems) {

		System.out.println("*** [MatterAggregator] ****");
		System.out.println("*** [MatterAggregator] ****");
		System.out.println("*** [MatterAggregator] ****");
		System.out.println("*** [MatterAggregator] ****");
		final Matter matter = new Matter();
		System.out.println("*** [MatterAggregator] order item size = " + orderItems.size());
		matter.setRouteItems(orderItems);
		return matter;
	
	}
}
