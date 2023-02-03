package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.EdgeDriver;

public class General extends Global {

	public void openApllication(){
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vasudev.agarwal\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get(url);
	}
	public void closeApllication() {
		driver.close();
	}
	
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
	}
	
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
	}
	
	public void enterFrame() {
		driver.switchTo().frame(frame_emplinfo);
	}
	
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
	}
	
	public void addEmployeee() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.xpath(txt_EFN)).sendKeys(EFN);
		driver.findElement(By.xpath(txt_ELN)).sendKeys(ELN);
		driver.findElement(By.id(btn_save)).click();
	}
	
	public void deleteEmployee() {
		Select dropdown=new Select(driver.findElement(By.xpath(drp_SearchBy)));
		dropdown.selectByValue(searchBy_value);
		driver.findElement(By.xpath(txt_SearchFor)).sendKeys(EFN);
		driver.findElement(By.xpath(btn_search)).click();
		driver.findElement(By.xpath(Checkbox)).click();
		driver.findElement(By.xpath(btn_delete)).click();
	}
}
