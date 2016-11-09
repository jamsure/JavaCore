package com.fk.javacore.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.fk.javacore.ood.Human;

public class ObjOsAndObjIs {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file = "javaObj\\ObjStream.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file, false));
		Human human1 = new Human("ID--100", 23);
		Human human2 = new Human("ID--102", 31);
		Human human3 = new Human("ID--103", 68);
		oos.writeObject(human1);
		oos.writeObject(human2);
		oos.writeObject(human3);
		oos.flush();
		oos.close();

		FileInputStream fis =new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Human> humanList = new ArrayList<Human>();
		//int x = ois.available();
		int x = fis.available();
		System.out.println(x);
		//while (ois.available() > 0) {
			while (fis.available() > 0) {
			humanList.add((Human) ois.readObject());
		}
		/*
		 * Human humans=(Human)ois.readObject(); Human
		 * humans1=(Human)ois.readObject(); Human
		 * humans2=(Human)ois.readObject();
		 */
			
		for (Human human : humanList) {
			System.out.println(human);
		}
		ois.close();
	}
}
