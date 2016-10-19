package com.att.it.bsa.mx.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.att.it.bsa.mx.domain.Matter;

public class YaanaGatewayDriver {
	
    private static final Logger log = Logger.getLogger((Class)YaanaGatewayDriver.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext(new String[]{"/META-INF/com/matters/matters-context.xml",
        				"/META-INF/com/matters/jdbc-context.xml"},(Class)YaanaGatewayDriver.class);
        YaanaGateway yaanaGateway = (YaanaGateway)context.getBean("yaanaGateway");
        log.debug((Object)"*** [YaanaGateway] ****");
        List<Matter> m = yaanaGateway.processMatters(new Object());
        context.close();
    }
    
    
    

}