package com.iodemo;

import java.io.File;

public class Worksheet {

	public static void main(String[] args) {
File f1=new File("E:\\Welcome.xlsx");
		
		String path=f1.getName();
		System.out.println(path);
		
		//String path1=f1.getParent();
		//System.out.println(path1);
		
		File f2=f1.getParentFile();
		System.out.println(f2);
		
		String path2=f1.getPath();
		System.out.println(path2);

		boolean val1=f1.isAbsolute();
		System.out.println("Is it a absolute?:"+val1);
		
		String path4=f1.getAbsolutePath();
		System.out.println(path4);
		
		File f3=f1.getAbsoluteFile();
		System.out.println(f3);
		try {
		String path6=f1.getCanonicalPath();
		System.out.println(path6);
		}catch(Exception e) {e.printStackTrace();}
		
		System.out.println("Can Read :"+f1.canRead());
		System.out.println("Can Write :"+f1.canWrite());
		System.out.println("Can Execute :"+f1.canExecute());
		
		boolean val2=f1.exists();
		System.out.println("File Exists :"+val2);
		
		System.out.println("Is it a Directory:"+f1.isDirectory());
		System.out.println("Is it a File:"+f1.isFile());
	}

}
