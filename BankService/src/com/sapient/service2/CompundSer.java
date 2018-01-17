package com.sapient.service2;

public class CompundSer implements ISer2{

	@Override
	public double calcCompound(double p, int n, float r) {

		return p * Math.pow((1 + r / 100), n) - p;
	}

}
