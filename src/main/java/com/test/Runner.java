package com.test;

import org.testng.annotations.Test;

import com.Ibase.IUser;
import com.IbaseImp.IUserImp;

import io.restassured.response.Response;

public class Runner {

	         String getURI = "https://reqres.in/api/users?page=2";
	         String postURI = "https://reqres.in/api/users";
	         String putURI = "https://reqres.in/api/users/2";
	         String deleteURI = "https://reqres.in/api/users/2";
	         
			  @Test(groups = {"get"})
	          public void getTest() {
						  IUser user  = new IUserImp();
				    	  user.get(getURI);
	          }
	    	  
			  @Test(groups = {"post"})
	          public void postTest() {
						  IUser user  = new IUserImp();
				    	  user.post(postURI);
	          }
	          
	          @Test(groups = {"put"})
	          public void putTest() {
			        	  IUser user  = new IUserImp();
				    	  user.put(putURI);
	          }
	          
	          @Test(groups = {"delete"})
	          public void deleteTest() {
			        	  IUser user  = new IUserImp();
				    	  user.delete(deleteURI);
	          }
			
}
