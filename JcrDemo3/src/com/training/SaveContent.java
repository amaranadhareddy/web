package com.training;
import javax.jcr.Repository; 
import javax.jcr.Session; 
import javax.jcr.SimpleCredentials;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jcr.Node; 
import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.ocm.manager.ObjectContentManager;
import org.apache.jackrabbit.ocm.manager.impl.ObjectContentManagerImpl;
import org.apache.jackrabbit.ocm.mapper.Mapper;
import org.apache.jackrabbit.ocm.mapper.impl.annotation.AnnotationMapperImpl;

public class SaveContent {

	public static void main(String[] args) throws Exception { 
	    Repository repository = JcrUtils.getRepository();
	        Session session = repository.login( 
	        new SimpleCredentials("admin", "admin".toCharArray()));
	        try { 
	        	List<Class> classes = new ArrayList<Class>();   
	        	classes.add(PressRelease.class); // Call this method for each persistent class

	        	Mapper mapper = new AnnotationMapperImpl(classes);
	        	ObjectContentManager ocm =  new ObjectContentManagerImpl(session, mapper);  

	        	
	        	PressRelease pressRelease = new PressRelease();
	        	pressRelease.setPath("/sports");
	        	pressRelease.setTitle("olympic games");
	        	pressRelease.setPubDate(new Date());
	        	pressRelease.setContent("India got two medals , sindhu got silver and deepa got bronze");
	        	
	        	PressRelease pressRelease2 = new PressRelease();
	        	pressRelease2.setPath("/film");
	        	pressRelease2.setTitle("awards");
	        	pressRelease2.setPubDate(new Date());
	        	pressRelease2.setContent("Kamalhassan conferred france chevalier award");
	        	ocm.insert(pressRelease);
	        	ocm.insert(pressRelease2);
	        	ocm.save();

	        	System.out.println("published");
	        	
	        	
	        	
	        } finally { 
	            session.logout(); 
	        } 
	    } 
}
