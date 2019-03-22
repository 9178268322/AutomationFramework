package com.util;

import static io.restassured.RestAssured.given;

import io.restassured.specification.RequestSpecification;

public class UserUtil {

			public static RequestSpecification getRequestSpecificationUtil() {
				
							RequestSpecification req = given();
							return req;
			}
}
