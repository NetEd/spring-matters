package com.att.it.bsa.mx.domain;

import java.io.Serializable;

public class RouteItem implements Serializable{

	private static final long serialVersionUID = 8550809367351405777L;
	
	private int count;
	private Report item;
		
	
	public RouteItem(Report r) {
		this.item = r;
	}
	
	
	public RouteItem(){
		
	}

	public Report getItem() {
		return item;
	}

	public void setItem(Report item) {
		this.item = item;
	}

	public int getCount() {
		return count;
	}

	public void incrementQuantity() {
		count++;
	}
	
	public void decrementQuantity() {
		count--;
	}
	public boolean isLastOne() {
		return count == 1;
	}
	
}
