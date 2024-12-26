package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfigure {
	Properties pro;
	String path="C:\\Users\\Nishu\\AUTOMATION_ASSEMENT_TASK\\magento.softwaretestingBoard_POM\\Configuration\\config.properties";
	public ReadConfigure()  {
		pro = new Properties();
		
		try {
		FileInputStream fi = new FileInputStream(path);
		pro.load(fi);
	}
		catch(Exception e) {
			System.out.println("Exception"+e.getMessage());
		}
	}
	
	public String getUrl() {
		String URL = pro.getProperty("Baseurl");
		return URL;
	}
	
	public String getFisrtname1() {
		String fname = pro.getProperty("firstname");
		return fname;
	}
	
	public String getlastname() {
		String lname = pro.getProperty("lastname");
		return lname;
	}

	public String getEmails() {
		String mail = pro.getProperty("email");
		return mail;
	}
	
	public String getpass() {
		String pass = pro.getProperty("password");
		return pass;
	}

	public String getConpwd() {
		String conrfpwd = pro.getProperty("Conformpwd");
		return  conrfpwd;
	}

	
	
	





}
