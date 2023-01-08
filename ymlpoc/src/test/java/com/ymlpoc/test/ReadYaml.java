package com.ymlpoc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

public class ReadYaml {
	
	public static void main(String[] args) {
		String filepath=System.getProperty("user.dir")+"/src/test/resources/Data/Sample.yaml";
			
		try {
			InputStream inputStream = new FileInputStream(new File(filepath));
			Yaml yaml = new Yaml();
			Map<String, Object> data = yaml.load(inputStream);
			System.out.println(data.get("id"));
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
