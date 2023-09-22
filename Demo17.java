package com.mypracticeofcorejava.collections;

import java.io.FileInputStream;
import java.util.Properties;


//Properties Class

public class Demo17 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("database.properties");
		Properties p=new Properties();
		p.load(fis);
		System.out.println(p);
		
		String uname=p.getProperty("uname");
		String pwd=p.getProperty("pwd");
		String driver=p.getProperty("driver");
		System.out.println(uname);
		System.out.println(pwd);
		System.out.println(driver);
		fis.close();
	}
}
