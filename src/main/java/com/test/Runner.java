package com.test;

import org.testng.annotations.Test;

import com.Ibase.IUser;
import com.IbaseImp.IUserImp;
import com.values.PropertieValues;

import io.restassured.response.Response;

public class Runner {

	        PropertieValues value = new PropertieValues();
	        
			  @Test(groups = {"get"})
	          public void getTest() {
						  IUser user  = new IUserImp();
						  String getURl = value.pro.getProperty("getUrl");
				    	  user.get(getURl);
	          }
	    	  
			  @Test(groups = {"post"})
	          public void postTest() {
						  IUser user  = new IUserImp();
						  String postURI = value.pro.getProperty("postUrl");
				    	  user.post(postURI);
	          }
	          
	          @Test(groups = {"put"})
	          public void putTest() {
			        	  IUser user  = new IUserImp();
			        	  String putURI = value.pro.getProperty("putUrl");
				    	  user.put(putURI);
	          }
	          
	          @Test(groups = {"delete"})
	          public void deleteTest() {
			        	  IUser user  = new IUserImp();
			        	  String deleteURI = value.pro.getProperty("deleteUrl");
				    	  user.delete(deleteURI);
	          }
			
}
