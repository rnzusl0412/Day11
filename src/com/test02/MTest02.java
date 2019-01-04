package com.test02;

interface IX{
	void prn();
}
interface IY{
	void disp();
}
interface IZ extends IX, IY{
	void KK();
}
public class MTest02 implements IZ{

	@Override
	public void disp() {

	}

	@Override
	public void prn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void KK() {
		// TODO Auto-generated method stub
		
	}
}
