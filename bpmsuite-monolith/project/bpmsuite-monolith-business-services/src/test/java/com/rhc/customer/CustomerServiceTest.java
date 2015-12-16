package com.rhc.customer;

import java.io.File;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.kie.api.KieServices;

import com.rhc.aggregates.Customer;
import com.rhc.services.AbstractBusinessServicesTest;

public class CustomerServiceTest extends AbstractBusinessServicesTest{
	
	@BeforeClass
	public static void init(){
		// ensure the latest version of the KieJar is on the classpath
		KieServices.Factory.get().newKieBuilder( new File(getKieJarPath()) ).buildAll();
	}
	
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
	
	
	public static String getKieJarPath(){
		String dir = System.getProperty("user.dir");
		return dir.substring(0, dir.lastIndexOf("/")) + "/bpmsuite-monolith-knowledge";
	}
}
