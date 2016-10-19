package com.att.it.bsa.mx.domain;

import java.io.Serializable;
import java.time.LocalDate;



public class Report implements Serializable{

	private static final long serialVersionUID = -429708360254033010L;

	/**
	 * no arguments constructor
	 */
	public Report(){

	}

	//inheritable members
	private LocalDate fromDate;
	private LocalDate toDate;

	public LocalDate getFromDate() {
		return fromDate;
	}
	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}
	public LocalDate getToDate() {
		return toDate;
	}
	public void setToDate(LocalDate toDate) {
		this.toDate = toDate;
	}
	
	
	
	
	
	
	

}
