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
	 * @param classname
	 * @param msg
	 * @param ex (not null)
	 */
	public static void logv(String classname, String msg, Exception ex){
		Log.v("tumtum", classname+": "+msg, ex);
	}

	public static class TimeProfile {
		long startTime, stopTime;
		public TimeProfile() {
			startTime = System.currentTimeMillis();
		}

		public void print(String classname){
			stopTime = System.currentTimeMillis();
			Utils.logv(classname,(stopTime - startTime)+"ms");
		}
	}
}
