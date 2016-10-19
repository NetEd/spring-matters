package org.it.bsa.mx.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.it.bsa.mx.domain.Matter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GatewayDriver {
	
    private static final Logger log = Logger.getLogger((Class)GatewayDriver.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = 
        		new ClassPathXmlApplicationContext(new String[]{"/META-INF/com/matters/matters-context.xml",
        				"/META-INF/com/matters/jdbc-context.xml"},(Class)GatewayDriver.class);
        ReportGateway gateway = (ReportGateway)context.getBean("gateway");
        log.debug((Object)"*** [YaanaGateway] ****");
        List<Matter> m = gateway.processMatters(new Object());
        context.close();
    }
    
    
    

}