package com.att.it.bsa.mx.service;

import org.springframework.integration.annotation.Gateway;
import java.util.List;
import com.att.it.bsa.mx.domain.Matter;



/**
 * Gateway interface. Provides facade to clients of the process pipeline
 * Will place all Matters into the input channel
 */

public interface YaanaGateway {

	@Gateway(requestChannel="findMattersRequestChannel")
	List<Matter> processMatters(Object o);

}


