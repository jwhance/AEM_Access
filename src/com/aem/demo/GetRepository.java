package com.aem.demo;

import javax.jcr.Repository;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.Node;

import org.apache.jackrabbit.commons.JcrUtils;
import org.apache.jackrabbit.core.TransientRepository;

public class GetRepository {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Demo");
		
		try {

		    //Create a connection to the CQ repository running on local host
		    Repository repository = JcrUtils.getRepository("http://localhost:4502/crx/server");	
		    
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
