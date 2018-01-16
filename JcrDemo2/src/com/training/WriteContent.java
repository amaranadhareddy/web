package com.training;

import javax.jcr.LoginException;
import javax.jcr.Node;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.core.TransientRepository;

public class WriteContent {

	public static void main(String[] args) throws LoginException, RepositoryException {
		// TODO Auto-generated method stub
		Repository repo = JcrUtils.getRepository("http://localhost:8083/server");
		Session sess = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		Node root = sess.getRootNode();
		Node film = root.addNode("film");
		Node hwood = film.addNode("hollywood");
		Node bwood = film.addNode("bollywood");
		Node jumanji = hwood.addNode("jumanji");
		jumanji.setProperty("review by amar", "comedy is nice but action sequences are not upto the mark");
		jumanji.setProperty("review by vasu", "excellent movie I have seen in my life");
		Node n1921 = bwood.addNode("1921");
		n1921.setProperty("review by sai", "no horror but comedy is good");
		n1921.setProperty("review by varun", "worst movie i have ever seen");
		
		sess.save();
		System.out.println("content published");
		sess.logout();
	}

}
