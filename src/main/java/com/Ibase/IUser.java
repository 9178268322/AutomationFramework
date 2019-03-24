package com.Ibase;

import io.restassured.response.Response;

public interface IUser {
            
			int getStatusCode = 200;
			int postStatusCode = 201;
			int putStatusCode = 200;
			int deleteStatusCode = 204;
			
		    void  get(String uri);
			void post(String uri);
			void put(String uri);
			void delete(String uri);
			
}
