package com.test01;

public class MTest04_sub extends MTest04 {
	private int age;

	public MTest04_sub() {
	}

	public MTest04_sub(String name, int age) {
		super(name);
		this.age = age;
	}
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void Prn() {
		System.out.println("name : "+getName()+"\t age : "+age);
	}
	
	public static void main(String[] args) {
		MTest04 u1 = new MTest04_sub("±è±¹Çö",28);
		u1.Prn();
		u1.setName("Á¤¿¹ºó");
		//u1 = new MTest04_sub("Á¤¿¹ºó",26);
		
		System.out.println(u1 instanceof MTest04_sub);
		((MTest04_sub)u1).setAge(26);		//´Ù¿î Ä³½ºÆÃ
		u1.Prn();
	}
}
