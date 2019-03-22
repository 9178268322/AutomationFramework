package com.IbaseImp;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;

import com.Ibase.IUser;
import com.util.UserUtil;

import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IUserImp implements IUser {

	                RequestSpecification reqSpeUtil = UserUtil.getRequestSpecificationUtil(); 
	                
					public void get(String uri) {
						
							Response res = reqSpeUtil.get(uri);
							
							int expected = res.statusCode();
							System.out.println("Status code is--------->"+expected);
							Assert.assertEquals(getStatusCode, expected);
							
							System.out.println("Json format data is------->"+res.asString());
							
							Headers header = res.getHeaders();
							System.out.println("Printing all headers-------->"+header);
					}


					public void post(String uri) {
						
						reqSpeUtil.contentType(ContentType.JSON);
						
						JSONObject jsonObj = new JSONObject();
				
						jsonObj.put("name", "Ani");
						jsonObj.put("job", "Developer");
						jsonObj.put("id", 15);
				
						String jsonString = jsonObj.toJSONString();
				
						reqSpeUtil.body(jsonString);
						
						Response res = reqSpeUtil.post(uri);
						
						int expected = res.statusCode();
						System.out.println("Status code is--------->"+expected);
						Assert.assertEquals(postStatusCode, expected);
						
						System.out.println("Json format data is------->"+res.asString());
						
						Headers header = res.getHeaders();
						System.out.println("Printing all headers-------->"+header);
					}


					public void put(String uri) {
						
						reqSpeUtil.contentType(ContentType.JSON);
						
						JSONObject jsonObj = new JSONObject();
				
						jsonObj.put("name", "Allen");
						jsonObj.put("job", "Tester");
						jsonObj.put("id", 15);
				
						String jsonString = jsonObj.toJSONString();
				
						reqSpeUtil.body(jsonString);
						
						Response res = reqSpeUtil.put(uri);
						
						int expected = res.statusCode();
						System.out.println("Status code is--------->"+expected);
						Assert.assertEquals(putStatusCode, expected);
						
						System.out.println("Json format data is------->"+res.asString());
						
						Headers header = res.getHeaders();
						System.out.println("Printing all headers-------->"+header);
					}


					public void delete(String uri) {
						
						Response res = reqSpeUtil.delete(uri);
						int expected = res.statusCode();
						System.out.println("Status code is--------->"+expected);
						Assert.assertEquals(deleteStatusCode, expected);
						
						System.out.println("Json format data is------->"+res.asString());
						
						Headers header = res.getHeaders();
						System.out.println("Printing all headers-------->"+header);
					}

}
