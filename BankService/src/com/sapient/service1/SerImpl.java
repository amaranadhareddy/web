package com.sapient.service1;

public class SerImpl implements ISer{

	@Override
	public double calcSimple(double p, int n, float r) {
		
		return p * n * r / 100;
	}

}
