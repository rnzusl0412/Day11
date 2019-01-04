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
		// �������ε� : �޸𸮿� ȣ��� ��ü�� �ּҸ� �̸� �����ؼ� ȣ���ϴ� ���
		// �������ε� : �ʿ��� ���� ������ �ּҸ� ���� �ļ��� �ּҸ� ȣ���ϴ� ���
		System.out.println("�������ε�");

		BB b1 = new BB();
		b1.Prn();

		DD d1 = new DD();
		d1.Prn();
		
		System.out.println("�������ε�");
		AA a1 = new FF();
		a1.Prn();
		a1 = new DD();
		a1.Prn();
	}
}
