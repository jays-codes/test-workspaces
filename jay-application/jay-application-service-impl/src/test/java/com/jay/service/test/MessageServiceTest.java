package com.jay.service.test;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.jay.service.JayServiceImpl;

public class MessageServiceTest {

	@Test
	public void test_getMessage() {
		JayServiceImpl svc = new JayServiceImpl();
		String actual = svc.getMessage();
		String expected = "JayServiceImpl is running: " + System.currentTimeMillis();
		Assertions.assertThat(actual).isEqualTo(expected);
	}

}
