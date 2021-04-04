package com.sgtesting.actitime.driverscript;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import com.sgtesting.actitime.datatable.Datatable;
import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Users;

public class DriverScript {
	public static WebDriver oBrowser=null;
	public static String sPath=null;
	public static String sControllerFile=null;
	public static Datatable datatable=null;
	public static String sTestScriptDataFile=null;
	public static void main(String[] args) {
		
		try
		{
			sPath=System.getProperty("user.dir");
			datatable=new Datatable();
			sControllerFile=sPath+"\\Controller\\data_Controller.xlsx";
			int iControllerRowCount=datatable.rowCount(sControllerFile, "Scenarios");
			for(int tcid=0;tcid<iControllerRowCount;tcid++)
			{
				String testcaseid=datatable.getCellData(sControllerFile, "Scenarios", "TestcaseID", tcid+2);
				String testcasename=datatable.getCellData(sControllerFile, "Scenarios", "TestcaseName", tcid+2);
				String testdesc=datatable.getCellData(sControllerFile, "Scenarios", "Description", tcid+2);
				String runstatus=datatable.getCellData(sControllerFile, "Scenarios", "RunStatus", tcid+2);
				System.out.println("testcaseid :"+testcaseid);
				System.out.println("testcasename :"+testcasename);
				System.out.println("testdesc :"+testdesc);
				System.out.println("runstatus :"+runstatus);
				if(runstatus.equalsIgnoreCase("yes"))
				{
					oBrowser=Initialize.launchBrowser();
					//Create Parameter for Reflection
					Class[] driverparam=new Class[1];
					driverparam[0]=WebDriver.class;
					
					sTestScriptDataFile=sPath+"\\TestScriptDataFiles\\"+testcasename+".xlsx";
					int TestScriptDataFileRowCount=datatable.rowCount(sTestScriptDataFile, testcaseid);
					for(int tsid=0;tsid<TestScriptDataFileRowCount;tsid++)
					{
						String testscriptid=datatable.getCellData(sTestScriptDataFile, testcaseid, "TestScriptID", tsid+2);
						String testscriptdesc=datatable.getCellData(sTestScriptDataFile, testcaseid, "Description", tsid+2);
						String testmethodname=datatable.getCellData(sTestScriptDataFile, testcaseid, "MethodName", tsid+2);
						String testpkgclassname=datatable.getCellData(sTestScriptDataFile, testcaseid, "PackageClassName", tsid+2);
						System.out.println("testscriptid :"+testscriptid);
						System.out.println("testscriptdesc :"+testscriptdesc);
						System.out.println("testmethodname :"+testmethodname);
						System.out.println("testpkgclassname :"+testpkgclassname);
						
						Class cls=Class.forName(testpkgclassname);
						Object obj=cls.newInstance();
						
						Method method=obj.getClass().getMethod(testmethodname, driverparam);
						method.invoke(obj, oBrowser);
					}
					System.out.println("+++++++++++++++++++++++++++");
				}
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
