package com.fk.javacore.io;

import java.io.*;
/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;*/

public class ReaderWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintStream out=System.out;
		File file=new File(
				"F:"+File.separator+"Temp"+File.separator+"Test"+File.separator+"people.txt");
		File file2=new File(
				"F:"+File.separator+"Temp"+File.separator+"Test"+File.separator+"people_cn.txt");
		//OutputStream os2=new FileOutputStream(file2,true);
		String str="\r\n+++++aaaaavvvbbfff+++++";
		String strcn="\r\n++++++中国人+++++++-----";
		
//读取文件编码类型		
		InputStream is=new FileInputStream(file);
		InputStreamReader reader=new FileReader(file);
		out.println(reader.getEncoding());
		InputStreamReader reader2=new FileReader(file2);
		out.println(reader2.getEncoding());
		
//
		OutputStream os=new FileOutputStream(file,true);
		Writer writer=new OutputStreamWriter(os,"gbk");
		writer.write(str);
		writer.write(strcn);
		
		
		InputStream is2=new FileInputStream(file2);
		Reader reader3=new InputStreamReader(is2,"gbk");
		char[] b=new char[(int)file2.length()];
		reader3.read(b);
		out.println(new String(b));
		
		
		
		
		
		reader3.close();
		writer.close();
		os.close();
		is.close();
		reader.close();
		reader2.close();

		
		
	}

}
