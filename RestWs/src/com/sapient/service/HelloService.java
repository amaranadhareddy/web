package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloService {

	@Path("helloplain")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@QueryParam("name")String str){
		return("amar welcomes "+str);
	}
	
	@Path("hellohtml")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello2(@QueryParam("name")String str){
		return("<h2>amar welcomes "+ str +"</h2>");
	}
	
	@Path("hellojson/{pname}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map sayHello3(@PathParam("pname")String str){
		Map<String, Object> map = new HashMap<>();
		map.put("ename", str);
		map.put("msg", "govind welcomes" + str);
		return map;
	}
}
