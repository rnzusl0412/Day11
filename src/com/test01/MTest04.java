package com.test01;

public abstract class MTest04 {
	private String name;

	public MTest04() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MTest04(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public abstract void Prn(); // 출력메소드
	
}
