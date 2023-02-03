package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;

//To Provide TestData & Objects realted to whole application

//************TestData
//      DT    Var    VV
public String url = "http://183.82.103.245/nareshit/login.php";
public String un  = "nareshit";
public String pw  = "nareshit";
public String EFN="VDA";
public String ELN="Tester";
public String searchBy_value="1";

//************Objects / Elements
public String txt_loginname = "txtUserName";
public String txt_password  = "txtPassword";
public String btn_login     = "Submit";
public String link_logout   = "Logout";//linktext
public String frame_emplinfo="rightMenu";
public String btn_Add="//input[@value='Add']";//xpath
//public String txt_EFN="txtEmpFirstName";//id
//public String txt_ELN="txtEmpLastName";//id
public String txt_EFN="//input[@id='txtEmpFirstName']";//xpath
public String txt_ELN="//input[@id='txtEmpLastName']";//Xpath
public String btn_save="btnEdit";//id
public String drp_SearchBy="//select[@id='loc_code']";//Xpath
public String txt_SearchFor="//input[@id='loc_name']";//Xpath
public String btn_search="//*[@value='Search']";//Xpath
public String Checkbox="//input[@value='1319']";
public String btn_delete="//input[@value='Delete']";
}
