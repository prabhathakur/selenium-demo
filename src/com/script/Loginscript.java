package com.script;

import org.testng.annotations.Test;

import com.genric.Excel;
import com.genric.Supertestng;
import com.page.loginpage;

public class Loginscript extends Supertestng {
	
	String xlpath="./inputdata/Demo.xlsx";
	String Sheetname="Sheet1";
	
	
	@Test
	public void test()
	{
		int count = Excel.getrowcount(xlpath, Sheetname);
		for(int i=1; i<=count; i++)
		{
			String un=Excel.getcelvalue(xlpath, Sheetname, i, 0);
			String pwd=Excel.getcelvalue(xlpath, Sheetname, i, 1);		
			
			loginpage lp=new loginpage(driver);
			lp.login(un, pwd);
			
		}
			
		
		
	}

}
