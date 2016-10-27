package com.fk.javacore.interfaceandavstract;

import org.omg.CORBA.PUBLIC_MEMBER;

public class TestPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlaygames hwPhone=new HwPhone();
		hwPhone.IPlaygames();
		HwPhone hwPhone2=(HwPhone)hwPhone;
		hwPhone2.message();
		
		
		
		
	}

}
