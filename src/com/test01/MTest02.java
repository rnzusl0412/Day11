package com.test01;

abstract class AA {

	public abstract void Prn();
}

class BB extends AA {
	@Override
	public void Prn() {
		System.out.println("BB' Prn");
	}
}

class DD extends AA {
	public void Prn() {
		System.out.println("DD' Prn");
	}
}

abstract class EE extends DD {
	public abstract void Prn();
}

class FF extends DD {
	public void Prn() {
		System.out.println("FF' Prn");
	}
}

public class MTest02 {

	public static void main(String[] args) {
		// 정적바인딩 : 메모리에 호출된 객체의 주소를 미리 선언해서 호출하는 방법
		// 동적바인딩 : 필요할 땜나 선조의 주소를 통해 후손의 주소를 호출하는 방법
		System.out.println("정적바인딩");

		BB b1 = new BB();
		b1.Prn();

		DD d1 = new DD();
		d1.Prn();
		
		System.out.println("동적바인딩");
		AA a1 = new FF();
		a1.Prn();
		a1 = new DD();
		a1.Prn();
	}
}
