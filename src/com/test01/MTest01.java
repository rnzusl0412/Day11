package com.test01;

public class MTest01 {
	public static void main(String[] args) {
		// ex1 한문자를 대입받아서 대문자인지 유무를 리턴하자
		char ch01 = 'A';
		boolean fw = Character.isUpperCase(ch01);
		System.out.println("ch01 = " + fw);

		// ex2 ch가 숫자인지를 리턴하자.
		fw = Character.isDigit(ch01);
		System.out.println("ch01 = " + fw + "\t" + Character.getType(ch01));

		char ch02 = Character.toLowerCase(ch01);
		System.out.println("ch02 = " + ch02);
		
		//ex3 대입받은 문자열을 대문자로 바꿔보자
		String str = "Returns a string";
		String str2 = str.toUpperCase();
		System.out.println(str2);
	}
}
