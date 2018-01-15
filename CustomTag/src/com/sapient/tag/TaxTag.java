package com.sapient.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;



public class TaxTag extends SimpleTagSupport{

	private double income;
	private String var;
	
	public void setIncome(double income) {
		this.income = income;
	}

	public void setRes(String var) {
		this.var = var;
	}

	@Override
	public void doTag() throws JspException, IOException {
		double tax=0;
		if(income>1000000){
			tax = (1000000-250000)*0.1 + (income-1000000)*0.2;
		}
		else if(income>250000){
			tax = (income-250000)*0.1;
		}
		getJspContext().setAttribute(var, tax);
		getJspBody().invoke(null);
	}

	

	
}
