package com.sapient.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;



@Path("/")
public class ProductService {
    
	private static Map<Integer, Product> pmap= new HashMap<Integer, Product>();
	
	
	static{
		pmap.put(1001, new Product(1001,"acer aspire laptop",45000 ));
		pmap.put(1002, new Product(1002,"dell  laptop",37000 ));
		pmap.put(1003, new Product(1003,"sony lenova laptop",53000 ));
		
		
	}
	
	@Path("viewbyid")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Product viewProduct(@QueryParam("pid") int pid){
		return pmap.get(pid);
	}
	
	@Path("viewall")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> viewProduct(){
		List<Product> lst = new ArrayList<>();
		lst.addAll(pmap.values());
		return lst;
	}
	
	
	@Path("add")
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String addProduct(@FormParam("pid") int pid,
			                 @FormParam("pname") String pname, 
			                 @FormParam("price") double price){
		if(pmap.containsKey(pid))
			return "Id exists";
		pmap.put(pid, new Product(pid,pname, price));
		return "product added";
	}
	
	@Path("edit")
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String updateProduct(@QueryParam("pid") int pid, 
								@QueryParam("price") double price){
		if(pmap.containsKey(pid)){
			Product prod = pmap.get(pid);
			prod.setPrice(price);
			return "updated";
		}else{
			return "Product not found";
		}
	}
	
	@Path("delete")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteProduct(@QueryParam("pid") int pid){
		if(pmap.containsKey(pid)){
			pmap.remove(pid);
			return "deleted";
		}else{
			return "Product not found";
		}
	}
	
}



















