package org.it.bsa.mx.service;

import org.it.bsa.mx.domain.Matter;
import org.springframework.integration.annotation.Gateway;
import java.util.List;



/**
 * Gateway interface. Provides facade to clients of the process pipeline
 * Will place all Matters into the input channel
 */

public interface ReportGateway {

	@Gateway(requestChannel="findMattersRequestChannel")
	List<Matter> processMatters(Object o);

}


