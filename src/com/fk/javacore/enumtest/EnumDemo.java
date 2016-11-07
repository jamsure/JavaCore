package com.fk.javacore.enumtest;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum EnumDemo {
	MONDAY(1,"星期一","上班"),TUESDAY(1,"星期二","上班"),WEDNESDAY(1,"星期三","上班"),THURSDAY(1,"星期四","上班"),
	FRIDAY(1,"星期五","上班"),STAURDAY(1,"星期六","不上班"),SUNDAY(1,"星期日","不上班");
	@Setter
	private Integer index;
	@Setter
	private String des;
	@Setter
	private String state;
	
	private EnumDemo (int index,String des,String state) {
		this.index=index;
		this.des=des;
		this.state=state;
	}
	private EnumDemo () {
	}
}
