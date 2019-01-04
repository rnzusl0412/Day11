package com.test01;
abstract class ATest{		//접근제한자가  선조보다 후손이 더 넓어야 한다.
	protected abstract void Disp();	//
	public void Prn() {
	}
	public void Disp2() {
		
	}
}
class BTest extends ATest{
	@Override
	public void Disp() {
	}
	public final void Prn() {
		
	}
}
public class MTest03 {
	public static void main(String[] args) {
		ATest a1 = new BTest();
		a1.Disp();
	}
}
