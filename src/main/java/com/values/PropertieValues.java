package com.values;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertieValues {
			
				public Properties pro;
				
				public PropertieValues(){
						try {
							pro = new Properties();
							FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/config/config.properties");
							pro.load(ip);
						} catch (FileNotFoundException e) {
							 e.printStackTrace();
						}
                        catch (IOException e) {
							e.printStackTrace();
						}
				}
}
