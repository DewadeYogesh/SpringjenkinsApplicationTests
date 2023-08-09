package com.springJenkins.springjenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SpringjenkinsApplicationTests {
	public static Logger logger= LoggerFactory.getLogger(SpringjenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("TestCase Executing");
		assertEquals(true,true);
	}

}
