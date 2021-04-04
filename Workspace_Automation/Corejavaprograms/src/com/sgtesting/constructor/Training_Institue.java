package com.sgtesting.constructor;
class Institute
{
	String Instituename;
	String Instituetype;
	int noofstudents;
	Institute(String a,String b,int x)
	{
		 Instituename="SgTesting";
		 Instituetype="SoftwareTesting";
		 noofstudents=100;
		 System.out.println( Instituename);
		 System.out.println( Instituetype);
		 System.out.println(noofstudents);
	}
}
public class Training_Institue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Institute a=new Institute("SgTesting","SoftwareTesting",100);

	}

}
