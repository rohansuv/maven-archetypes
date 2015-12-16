package com.rhc.entities;

public class Address {
	
	private int num;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public void setAddress(int n, String s, String c, String st, int z) {
		
		num=n;
		street=s;
		city=c;
		street=st;
		zip=z;
	}
	
	public String getFullAddress() {
		return Integer.toString(num)+" "+street+" "+city+" "+state+" "+Integer.toString(zip);
	}
	
	
}
