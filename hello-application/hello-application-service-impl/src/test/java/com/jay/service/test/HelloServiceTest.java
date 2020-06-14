package com.jay.service.test;

import org.junit.jupiter.api.Assertions;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.jay.service.HelloServiceImpl;

public class HelloServiceTest {
	
	@Test
	public void should_return_hello_service_message() {
		HelloServiceImpl service = new HelloServiceImpl();
		
		String expected = "Hello from HelloServiceImpl()";
		String actual = service.getMessage();
		
		Assertions.assertEquals(expected, actual);
		//Assertions.assertThat(actual).isEqualTo(expected);
	}
}
