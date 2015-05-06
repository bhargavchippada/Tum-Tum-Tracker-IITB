package support;

import android.util.Log;

public class Utils {
	/**
	 * Prints debugging log messages
	 * 
	 * @param classname String
	 * @param msg String
	 */
	public static void logv(String classname, String msg){
		Log.v("tumtum",classname+" : "+msg);
	}


	/**
	 * Prints debugging log messages along with exception info
	 * 
	 * @param classname String
	 * @param msg String
	 * @param ex (not null) Exception
	 */
	public static void logv(String classname, String msg, Exception ex){
		Log.v("tumtum", classname+": "+msg, ex);
	}

	/**
	 * Class for time profiling the code
	 * @author bhargav
	 */
	public static class TimeProfile {
		long startTime, stopTime;
		
		public TimeProfile() {
			startTime = System.currentTimeMillis();
		}

		public void print(String classname){
			stopTime = System.currentTimeMillis();
			Utils.logv(classname,"Time-taken: "+(stopTime - startTime)+"ms");
		}
	}
}
