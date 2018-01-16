package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Property;
import javax.jcr.PropertyIterator;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

public class ReadContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		Repository repo = new TransientRepository();
		Session sess = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		Node node = sess.getNode("/courses/java");
		Property prop = node.getProperty("what is java");
		System.out.println(prop.getString());
		
		System.out.println("------------------getting all the properties of java code------------------");
		Node java = sess.getNode("/courses/jee");
		PropertyIterator it = java.getProperties();
		Property property= null;
		while(it.hasNext()){
			property = (Property)it.next();
			System.out.println(property.getName()+"-- "+property.getString());
		}
		sess.logout();
	}

}
