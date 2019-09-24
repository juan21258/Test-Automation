package log4j;

import org.apache.logging.log4j.*;

public class Alpha {
	
	private static Logger log = LogManager.getLogger(Alpha.class.getName());
	public static void executeLogs() {
		//The default configuration just prints configuration messages
		//We added a config xml file to indicate different settings for the logs
		log.debug("Debugging");
		log.info("Object is present");
		log.error("object is not present");
		log.fatal("this is fatal");
	}
}