package com.rhc.customer;

import org.junit.Assert;
import org.junit.Test;

import com.rhc.aggregates.Customer;
import com.rhc.services.AbstractBusinessServicesTest;

public class CustomerServiceTest extends AbstractBusinessServicesTest{
	
	@Test
	public void shouldSuccessfullyStartACustomerOnboardProcess(){
		// given
		Assert.assertNotNull(customerService);
		Customer leia = new Customer();
		leia.setFirstName("Leia");
		leia.setLastName("Organa");
		
		// when 
		Long processId = customerService.startCustomerOnboardProcess(leia);
		 
		// then
		Assert.assertEquals( new Long(1), processId);
		Assert.assertEquals( 1, customerService.getNumberOfCustomerOnboardProcessesInProgress());
	}
	
}
