package com.Json.Test;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
  Student st = new Student();
  st.setSid(100);
  st.setName("Tara");
  st.setMarks(870);
  Address ad = new Address();
  
  ad.setArea("Denton");
  ad.setBuildingName("Kensington");
  ad.setFlatno(507);
  st.setAddress(ad);
  ObjectMapper mapper = new ObjectMapper();
  mapper.writeValue(new File("Student.json"), st);
  System.out.println("Json is generated");
	}

}
