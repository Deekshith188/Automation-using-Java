package com.iodemo;

import java.io.File;

public class FileDemo1 {
	public static void main(String[] args) {
		File f1=new File("E:\\iodemo\\Welcome.txt");
		String path=f1.getName();
		System.out.println(path);
			
		String Path1=f1.getParent();
		System.out.println(Path1);
		
		File f2=f1.getParentFile();
		System.out.println(f2);
		
		File path2=f1.getParentFile();
		System.out.println(path2);
		
		
		boolean val=f1.isAbsolute();
		System.out.println("It is a absolute:"+val);
		
		String path4=f1.getAbsolutePath();
		System.out.println(path4);
		
		File f3=f1.getAbsoluteFile();
		System.out.println(f3);
		
		try 
		{
		String path6=f1.getCanonicalPath();
		System.out.println(path6);
		}catch(Exception e) {e.printStackTrace();
		}
		
		System.out.println("Can Read :"+f1.canRead());
		System.out.println("Can Write :"+f1.canWrite());
		System.out.println("Can Execute :"+f1.canExecute());
		
		boolean val2=f1.exists();
		System.out.println("File Exists :"+val2);
		
		System.out.println("Is it a Directory:"+f1.isDirectory());
		System.out.println("Is it a File:"+f1.isFile());
	}
}

