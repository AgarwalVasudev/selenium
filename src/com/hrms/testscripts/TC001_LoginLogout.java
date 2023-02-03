package com.hrms.testscripts;
import org.testng.annotations.Test;

import com.hrms.lib.General;


public class TC001_LoginLogout {
	@Test
	public void tc001() throws Exception {
General obj=new General();
 obj.openApllication();
 Thread.sleep(4000);
 obj.login();
 Thread.sleep(4000);
 obj.logout();
 Thread.sleep(4000);
 obj.closeApllication();
 
	}
	
	
}
