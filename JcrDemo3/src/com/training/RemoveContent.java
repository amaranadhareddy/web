package com.training;

import java.util.ArrayList;
import java.util.List;

import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.ocm.manager.ObjectContentManager;
import org.apache.jackrabbit.ocm.manager.impl.ObjectContentManagerImpl;
import org.apache.jackrabbit.ocm.mapper.Mapper;
import org.apache.jackrabbit.ocm.mapper.impl.annotation.AnnotationMapperImpl;

public class RemoveContent {

	public static void main(String[] args)throws Exception {
		Repository repository = JcrUtils.getRepository();
		Session session = repository.login(new SimpleCredentials("admin", "admin".toCharArray()));

		List<Class> classes = new ArrayList<Class>();
		classes.add(PressRelease.class); // Call this method for each persistent
											// class

		Mapper mapper = new AnnotationMapperImpl(classes);
		ObjectContentManager ocm = new ObjectContentManagerImpl(session, mapper);
		// Retrieve 
    	System.out.println("Retrieve a press release from the repository");
    	PressRelease obj = (PressRelease) ocm.getObject("/sports");
    	ocm.remove(obj);
    	ocm.save();
    	session.logout(); 

	}

}
