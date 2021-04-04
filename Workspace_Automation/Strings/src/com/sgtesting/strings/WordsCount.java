package com.sgtesting.strings;

public class WordsCount {

	public static void main(String[] args) {
		String input="Java JDK JRE java JDK Java";
		String []words= input.split(" ");
		int wrc=1;
		for (int i=0;i<words.length;i++) {
			for (int j=i+1;j<words.length;j++)
			{
				if(words[i].equalsIgnoreCase(words[j]))	{
					wrc=wrc+1;
					words[j]="0";
				}
			}if (words[i]!="0")
				System.out.println(words[i]+"_____"+wrc);
			wrc=1;

		}
	}

}
