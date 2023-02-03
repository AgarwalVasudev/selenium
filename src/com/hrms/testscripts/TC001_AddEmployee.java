package com.hrms.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001_AddEmployee {
	General obj=new General();
	@BeforeClass
	public void startup() throws InterruptedException {
		obj.openApllication();
		Thread.sleep(2000);
		obj.login();
		Thread.sleep(3000);
	}
	@AfterClass
	public void tearDown() throws InterruptedException {
		obj.logout();
		Thread.sleep(2000);
		obj.closeApllication();

	}
@Test
	public void tc002() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		obj.enterFrame();
		Thread.sleep(2000);
		obj.addEmployeee();
		Thread.sleep(2000);
		obj.exitFrame();
		Thread.sleep(2000);
		

	}

}
