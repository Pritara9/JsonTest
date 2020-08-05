package com.Json.Test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
ObjectMapper mapper = new ObjectMapper();
Student st = mapper.readValue(new File("Student.json"), Student.class);
System.out.println(st.getSid());
System.out.println(st.getName());
System.out.println(st.getMarks());
Address ad = st.getAddress();



System.out.println(ad.getArea());
System.out.println(ad.getBuildingName());
System.out.println(ad.getFlatno());

System.out.println("Java  class file is generated");

	}

}
