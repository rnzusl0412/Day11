package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		// ex1 �ѹ��ڸ� ���Թ޾Ƽ� �빮������ ������ ��������
		char ch01 = 'A';
		boolean fw = Character.isUpperCase(ch01);
		System.out.println("ch01 = " + fw);

		// ex2 ch�� ���������� ��������.
		fw = Character.isDigit(ch01);
		System.out.println("ch01 = " + fw + "\t" + Character.getType(ch01));

		char ch02 = Character.toLowerCase(ch01);
		System.out.println("ch02 = " + ch02);
		
		//ex3 ���Թ��� ���ڿ��� �빮�ڷ� �ٲ㺸��
		String str = "Returns a string";
		String str2 = str.toUpperCase();
		System.out.println(str2);
	}
}
