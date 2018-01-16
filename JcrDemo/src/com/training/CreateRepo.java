package com.training;

import javax.jcr.LoginException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;

import org.apache.jackrabbit.core.TransientRepository;

/*
 * displays repository version, vendor and name
 */
public class CreateRepo {

	public static void main(String[] args) throws LoginException, RepositoryException {
		// TODO Auto-generated method stub
		Repository repo = new TransientRepository();
		Session sess = repo.login(new SimpleCredentials("admin", "admin".toCharArray()));
		System.out.println("User Id " + sess.getUserID());
		String version = repo.getDescriptor(Repository.REP_VERSION_DESC);
		String vendor = repo.getDescriptor(Repository.REP_VENDOR_DESC);
		String name = repo.getDescriptor(Repository.REP_NAME_DESC);
		System.out.println("version " + version);
		System.out.println("vendor " + vendor);
		System.out.println("name " + name);
		sess.logout();
	}

}
