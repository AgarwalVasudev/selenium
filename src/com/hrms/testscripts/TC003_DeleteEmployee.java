package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003_DeleteEmployee {
     @Test
	public void tc003()throws Exception {
		// TODO Auto-generated method stub
		General obj=new General();
		obj.openApllication();
		Thread.sleep(2000);
		obj.login();
		Thread.sleep(3000);
		obj.enterFrame();
		Thread.sleep(2000);
		obj.deleteEmployee();
		Thread.sleep(2000);
		obj.exitFrame();
		Thread.sleep(2000);
		obj.logout();
		Thread.sleep(2000);
		obj.closeApllication();

	}

}
