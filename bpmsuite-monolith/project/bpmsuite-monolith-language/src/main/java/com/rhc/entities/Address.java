package com.rhc.entities;

public class Address {
	
	private int num;
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public void setNum(int n) {
		num =n;
	}
	
	public void setStreet(String s) {
		street=s;
	}
	
	public void setCity(String c) {
		city=c;
	}
	
	public void setState(String st) {
		state=st;
	}
	
	public void setZip(int z) {
		zip = z;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
	/*
	public void setAddress(int n, String s, String c, String st, int z) {
		
		num=n;
		street=s;
		city=c;
		street=st;
		zip=z;
	}*/
	
	public String getFullAddress() {
		return Integer.toString(num)+" "+street+" "+city+" "+state+" "+Integer.toString(zip);
	}
	
	
}
