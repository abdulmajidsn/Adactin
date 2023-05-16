package Utilities;

import org.apache.log4j.Logger;

public class Log {
private static Logger Log=Logger.getLogger(Log.class.getName());

	public static void info(String messege) {
		Log.info(messege);
	}
	public static void error(String messege) {
		Log.error(messege);
	}
}
