package com.fk.javacore.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException {
		//PrintStream out=System.out;
		OutputStream outS=null;
		File file=new File("F:"+File.separator+"Temp"+File.separator+"Test"+File.separator+"Test.txt");
		/*if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}*/
		outS=new FileOutputStream(file,true);
		String name="\r\n我是中国人";
		Integer age=100;
		
		outS.write(age);
		
		outS.write(name.getBytes());
		outS.close();
		
	}

}
