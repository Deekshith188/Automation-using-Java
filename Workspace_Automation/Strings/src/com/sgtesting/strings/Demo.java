package com.sgtesting.strings;

public class Demo {

	public static void main(String[] args) {
				lowerCase();
				upperCase();
				strLength();
				isEmptyDemo();
				compareString1();
				compareString2();
				subStringDemo();
				existanceOfString();
				splitDemo();
				replaceDemo();
				ConvertToString();
				charAt();
				indexOfDemo();
				indexOfDemo();
				toCharArray();
			}
			
			static void lowerCase()
			{
				String s="PROGRAMMING";
				System.out.println("Lower Case :"+s.toLowerCase());
				System.out.println("+++++++++++++++++");
			}
			
			static void upperCase()
			{
				String s="programming";
				System.out.println("Upper Case :"+s.toUpperCase());
				System.out.println("+++++++++++++++++");
			}
			
			static void strLength()
			{
				String s="Programming";
				System.out.println("# of Chars :"+s.length());
				System.out.println("+++++++++++++++++");
			}
			
			static void isEmptyDemo()
			{
				String s=new String();
				System.out.println("Is String Blank:"+s.isEmpty());
				System.out.println("+++++++++++++++++");
			}
			
			static void compareString1()
			{
				String s1="JAVASCRIPT";
				String s2="JavaScript";
				System.out.println("(s1.equals(s2) :"+s1.equals(s2));
				System.out.println("Ignore Case and Compare:"+s1.equalsIgnoreCase(s2));
				System.out.println("+++++++++++++++++");
			}
			
			static void compareString2()
			{
				String s1="JAVASCRIPT";
				String s2="JavaScript";
				System.out.println("(s1.compareTo(s2) :"+s1.compareTo(s2));
				System.out.println("Ignore Case and Compare:"+s1.compareToIgnoreCase(s2));
				System.out.println("+++++++++++++++++");
			}
			
			static void subStringDemo()
			{
				String s=new String("Programming");
				System.out.println("SubString 1:"+s.substring(3));
				System.out.println("SubString 2:"+s.substring(3,7));
				System.out.println("+++++++++++++++++");
			}
			
			static void existanceOfString()
			{
				String s="Bangalore is a garden City";
				System.out.println("Starts With :"+s.startsWith("Bangalore"));
				System.out.println("Ends With :"+s.endsWith("City"));
				System.out.println("Contains :"+s.contains("garden"));
				System.out.println("+++++++++++++++++");
			}
			
			static void splitDemo()
			{
				String s="Bangalore and Mysore";
				String s1[]=s.split(" ");
				for(int i=s1.length-1;i>=0;i--)
				{
					System.out.print(s1[i]+" ");
				}
				System.out.println();
				System.out.println("+++++++++++++++++");
			}
			
			static void replaceDemo()
			{
				String s="It is a palace";
				System.out.println("Replace Result:"+s.replace("is", "was"));
				System.out.println("+++++++++++++++++");
			}
			
			static void ConvertToString()
			{
				int a=25;
				String s1=String.valueOf(a);
				System.out.println(s1);
				double d=12.75;
				String s2=String.valueOf(d);
				System.out.println(s2);
				System.out.println("+++++++++++++++++");
			}

			static void charAt()
			{
				String s="VIOLET";
				System.out.println("3rd Position Char :"+s.charAt(3));
				System.out.println("+++++++++++++++++");
			}
			
			static void indexOfDemo()
			{
				String s="Java Programming";
				System.out.println("Index Of (Left to Right) :"+s.indexOf("P"));
				System.out.println("Last index OF(Right 2 Left):"+s.lastIndexOf("Prog"));
				System.out.println("Last Index :"+s.lastIndexOf('g', 14));
				System.out.println("+++++++++++++++++");
			}
			
			static void toCharArray()
			{
				String s="Programming";
				char ch[]=s.toCharArray();
				for (char ch1:ch) {
					System.out.println(ch1);
				}
				System.out.println("+++++++++++++++++");
			}
		
	}



