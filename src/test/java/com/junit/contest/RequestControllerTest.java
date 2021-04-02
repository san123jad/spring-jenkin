package com.junit.contest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestControllerTest {
	private static final Logger logger = LoggerFactory.getLogger(RequestControllerTest.class);
	@Test
	public void testTest() {
		logger.info("in Test Case");
		Assertions.assertEquals(true, true);
		logger.info("in Test Case Second For Test");
	}
}
