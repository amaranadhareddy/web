package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class WriteContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		Repository repo = new TransientRepository();
		Session sess = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		Node root = sess.getRootNode();
		Node courses = root.addNode("courses");
		Node java = courses.addNode("java");
		Node jee = courses.addNode("jee");
		Property prop1 = java.setProperty("what is java", "java is oo programming language");
		Property prop2 = java.setProperty("features of java", "functional programming, streams, nashron script");
		
		Property prop3 = jee.setProperty("lifecycle of servlet", "init() and destroy() fires only once and service method fires for every request");
		Property prop4 = jee.setProperty("implicit objects", "application, session, request, response, context, config, page, pagecontext, exception");
		
		sess.save();
		System.out.println("content published");
		sess.logout();
	}

}
