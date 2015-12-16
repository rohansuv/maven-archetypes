package com.rhc.aggregates;

import java.io.Serializable;

import com.rhc.entities.Address;


public class Customer implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private Address address = new Address();

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String s) {
		firstName = s;
	}
	
	public void setLastName(String s) {
		lastName = s;
	}
	
	public void setAddress(Address a, int n, String s, String c, String st, int z) {
		a.setAddress(n, s, c, st, z);
	}
	
	public String getAddress() {
		return address.getFullAddress();
	}
}
