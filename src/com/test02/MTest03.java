package com.test02;

public class MTest03 implements IX{

	@Override
	public void prn() {
		System.out.println("MTest03.Prn");
	}
	public static void main(String[] args) {
		new MTest03().prn();
	}

}
