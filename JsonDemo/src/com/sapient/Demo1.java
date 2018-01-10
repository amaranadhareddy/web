package com.sapient;

import org.json.simple.JSONObject;

public class Demo1 {

	public static void main(String[] args) {
		
		JSONObject json = new JSONObject();
		json.put("eid", 1001);
		json.put("ename", "Amar");
		json.put("sal", 25000);
		
		System.out.println(json);
	}

}
