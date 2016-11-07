package com.fk.javacore.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferTest {
	
	public static void main(String[] args) throws IOException {
		File src=new File("D:"+File.separator+"Vedeo"+File.separator+"vedeo.zip");
		File dest=new File("D:"+File.separator+"Vedeo"+File.separator+"vedeocopy.zip");
		
		InputStream srcStream=new FileInputStream(src);
		BufferedInputStream bInputStream=new BufferedInputStream(srcStream);
		OutputStream destStream=new FileOutputStream(dest);
		BufferedOutputStream bOutputStream=new BufferedOutputStream(destStream);
		Long start=System.currentTimeMillis();
		int i;
		byte[] b=new byte[1024*1024];
		while ((i=bInputStream.read(b))!=-1) {	
			bOutputStream.write(b,0,i);
			/*bOutputStream.write(b);	
			if(bInputStream.available()<=i){
				byte[] bs=new byte[bInputStream.available()];
				bOutputStream.write(bs);	
				break;
			}*/
		}
		Long end=System.currentTimeMillis();
		System.out.println("复制完成！");
		System.out.println("共用时 ： "+(end-start));
		
		bInputStream.close();
		bOutputStream.close();
		
		
	}

}
