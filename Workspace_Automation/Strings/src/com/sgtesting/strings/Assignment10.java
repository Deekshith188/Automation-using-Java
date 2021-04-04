package com.sgtesting.strings;

public class Assignment10 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("sundaymondaytuesdaywednesdaythursdayfridaysaturday");
		StringBuffer s1=s.insert(6, ",");
		StringBuffer s2=s.insert(13, ",");
		StringBuffer s3=s.insert(21, ",");
		StringBuffer s4=s.insert(31, ",");
		
		StringBuffer s5=s.insert(40, ",");
		StringBuffer s6=s.insert(47, ",");
		StringBuffer s7=s.insert(56, ",");
		System.out.println(s7);
		
	}

}
