package org.it.bsa.mx.domain;

public class CallDetailRecord {

	
	private int phoneNumber;
	private String data;
	
	
	@Override
	public String toString() {
		return "CallDetailRecord [phoneNumber=" + phoneNumber + ", data=" + data + "]";
	}


	public int getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public CallDetailRecord()  {
		
	}
	
	
}
