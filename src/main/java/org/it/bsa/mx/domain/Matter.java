package org.it.bsa.mx.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Matter implements Serializable{

	private static final long serialVersionUID = -5362053016861873420L;
	private List<RouteItem> routeItems;
	private int rmsRequestId;
	private int jobId;
	private String Priority;
	private String JobData;
	private String status;
	private List<String> errors;
	
	//next 3 vars are temp... TODO get the json parsing stuff done.
	private String reportType;
	private Date reportFromDate;
	private Date reportToDate;
	
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getReportType() {
		return reportType;
	}


	public void setReportType(String reportType) {
		this.reportType = reportType;
	}


	public Date getReportFromDate() {
		return reportFromDate;
	}


	public void setReportFromDate(Date reportFromDate) {
		this.reportFromDate = reportFromDate;
	}


	public Date getReportToDate() {
		return reportToDate;
	}


	public void setReportToDate(Date reportToDate) {
		this.reportToDate = reportToDate;
	}


	public List<String> getErrors() {
		return errors;
	}


	public void setErrors(List<String> errors) {
		this.errors = errors;
	}


	public int getRmsRequestId() {
		return rmsRequestId;
	}


	public void setRmsRequestId(int reqId) {
		this.rmsRequestId = reqId;
	}


	public Integer getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public String getPriority() {
		return Priority;
	}


	public void setPriority(String priority) {
		Priority = priority;
	}


	public String getJobData() {
		return JobData;
	}


	public void setJobData(String jobData) {
		JobData = jobData;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public Matter() {
		routeItems = new ArrayList<RouteItem>();
	}


	public void setRouteItems(final List<RouteItem> items) {
		this.routeItems = items;
	}
	
	public List<RouteItem> getRouteItems() {
		return this.routeItems;
	}

	@Override
	public String toString() {
		//TODO, provide some imple for degbugging
		return "foo";
	}
	
}