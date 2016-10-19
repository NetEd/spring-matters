package com.att.it.bsa.mx.domain;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

public class YaanaMatterMapper implements RowMapper<Matter>{
	
	public Matter mapRow(ResultSet rs, int rowNum)  {
		
		
		Matter matter = new Matter();
		try {
		matter.setJobId(rs.getInt("JOB_ID"));
		matter.setPriority(rs.getString("PRIORITY"));
        ArrayList<RouteItem> routeItems = new ArrayList<RouteItem>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		
		if (rs.getString("REPORT_TYPE").equals("CDR") ) {
			System.out.println("*** [YaanaMatterMapper] *** Found a CDR report!");
			CallDetailReport cdrReport = new CallDetailReport();
			LocalDate localFromDate = LocalDate.parse(rs.getString("REPORT_FROM_DATE"), formatter);
			cdrReport.setFromDate(localFromDate);
			LocalDate localToDate = LocalDate.parse(rs.getString("REPORT_TO_DATE"), formatter);
			cdrReport.setToDate(localToDate);
		    RouteItem cdrItem = new RouteItem(cdrReport);
		    routeItems.add(cdrItem);
		       			
		}

		else if (rs.getString("REPORT_TYPE").equals("SUBSCRIBER"))  {
			System.out.println("*** [YaanaMatterMapper] *** Found a subscriber report!");
			SubscriberReport subReport = new SubscriberReport();
			LocalDate localFromDate = LocalDate.parse(rs.getString("REPORT_FROM_DATE"), formatter);
			subReport.setFromDate(localFromDate);
			LocalDate localToDate = LocalDate.parse(rs.getString("REPORT_TO_DATE"), formatter);
			subReport.setToDate(localToDate);
			RouteItem subItem = new RouteItem(subReport); 
			routeItems.add(subItem);

		}
		
    	matter.setRouteItems(routeItems);		
    	System.out.println("*** [YaanaMatterMapper] *** returning matter");
		}
    	catch (Exception e) {e.printStackTrace();} 
		return matter;
		
	}

}
