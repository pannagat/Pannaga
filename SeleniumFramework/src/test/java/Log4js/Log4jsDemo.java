package Log4js;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jsDemo {
	
	static Logger logger=LogManager.getLogger(Log4jsDemo.class);

	public static void main(String[] args) {
		
		System.out.println("\n      Hello World......................| \n");
		logger.trace("This is a trace level message");
		logger.info("This is a information only");
		logger.error("This is a error message");
		logger.warn("This is a warning message");
		

	}

}
