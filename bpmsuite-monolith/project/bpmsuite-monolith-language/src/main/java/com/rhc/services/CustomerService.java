package com.rhc.services;
import com.rhc.aggregates.*; 

public interface CustomerService {
	
	public Long startCustomerOnboardProcess( String firstName, String lastName );
	
	public int getNumberOfCustomerOnboardProcessesInProgress();
}
