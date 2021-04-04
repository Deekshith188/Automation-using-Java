package com.sgtesting.reflection4;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Class[] strparam=new Class[1];
			strparam[0]=String.class;
			
			Class intparam[]=new Class[1];
			intparam[0]=Integer.TYPE;
			
			Method m1=obj.getClass().getMethod("displayCity", strparam);
			m1.invoke(obj, new String("Santosh"));
			
			Method m2=obj.getClass().getMethod("showPincode", intparam);
			m2.invoke(obj, 560089);
					
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
