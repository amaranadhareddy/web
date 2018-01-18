package com.sapient.js;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Demo3 {

	
		// TODO Auto-generated method stub

		public String sayHello(String name){
			return "hello "+name;
		}
		public static String getDate(){
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy");
			return LocalDate.now().toString();
		}
	

}
