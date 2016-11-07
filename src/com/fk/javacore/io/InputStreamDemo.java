package com.fk.javacore.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class InputStreamDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out=System.out;
		InputStream inS=null;
		File file=new File("F:"+File.separator+"Temp"+File.separator+"Test"+File.separator+"Test.txt");
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		inS=new FileInputStream(file);
		
		
	}

}
