package com.samples.dmos.oop6;

public class MobilePhone implements ITelephone, IMaintainable{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("The power is on mobile");
		
	}

	@Override
	public void dial() {
		// TODO Auto-generated method stub
		System.out.println("Daialing a call from mobile");
		
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		System.out.println("Answering via call");
		
	}

	@Override
	public boolean isUnderWarranty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int restDevice() {
		// TODO Auto-generated method stub
		return 0;
	}
   
}
