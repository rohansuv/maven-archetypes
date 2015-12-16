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
	private Address address;

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
	
	
	public void setAddress(Address a) {
		address = a;
	}
	
	

	
	
	public String getAddress() {
		return address.getFullAddress();
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}
	

}
