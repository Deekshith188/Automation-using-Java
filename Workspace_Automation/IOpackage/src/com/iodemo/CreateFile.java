package com.iodemo;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) {
		createfile();
		renamefile();
		deletefile();
	}
	static void createfile()
	{
		try
		{
			File f1=new File("E:\\iodemo\\Welcome.docx");
			File f2=new File ("E:\\iodemo\\Welcome1.txt");
			f1.createNewFile();
			f2.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	static void renamefile() {
		File F1=new File("E:\\iodemo\\Welcome.docx");
		File F2=new File("E:\\iodemo\\WelcomeNew.txt");
		F1.renameTo(F2);
	}
	static void deletefile()
	{
		File f1=new File ("E:\\\\iodemo\\\\Welcome.docx");
		boolean x=f1.delete();
		
	}

}
