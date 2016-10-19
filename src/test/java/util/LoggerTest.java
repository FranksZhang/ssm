package util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerTest {

	private static Logger log = LoggerFactory.getLogger(LoggerTest.class);

	@Test
	public void test() {
		log.info("666");
	}

}
