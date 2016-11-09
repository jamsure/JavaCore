package com.fk.javacore.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.fk.javacore.ood.Human;
import com.fk.javacore.ood.Police;
import com.fk.javacore.ood.Student;

public class ObjOsAndObjIs2 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file = "javaObj\\ObjStream.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false));
		Collection collection=new ArrayList();
		Student student1=new Student("fankai",26);
		Human human1=new Police();
		Police police1=new Police();
		
		collection.add(human1);
		collection.add(police1);
		collection.add(student1);
		oos.writeObject(collection);
		
		FileInputStream fis =new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Collection coll=new ArrayList();
		while (fis.available()>0) {
			coll.add(ois.readObject());
		}
		for (Object object : coll) {
			System.out.println(object+"*=*");
		}
		

	
		
	}
}
