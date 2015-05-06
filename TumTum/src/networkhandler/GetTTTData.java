package networkhandler;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import support.AppSettings;
import support.Utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class GetTTTData {

	public static String classname="GetTTTData";
	public static final int NetworkConnectionTimeout_ms = 5000;

	/**
	 * Downloads the TTT json data from dataUrl and parses it.
	 * The method is synchronized for thread safety, only one thread will download and
	 * parse the data at any time.
	 * 
	 * @return true if data retrieval was success else false
	 */
	public static synchronized boolean threadSafeTTTDataSync(){
		HttpURLConnection urlConnection;
		try {
			urlConnection = (HttpURLConnection) new URL(AppSettings.dataUrl)
			.openConnection();
			urlConnection.setDoOutput(false);
			urlConnection.setConnectTimeout(NetworkConnectionTimeout_ms);
			try {
				InputStreamReader InStreamReader = new InputStreamReader(urlConnection.getInputStream());
				JsonElement jelement = new JsonParser().parse(InStreamReader);
				JsonObject  input = jelement.getAsJsonObject();
				//Utils.logv(classname, input.toString());
			}catch(Exception ex){
				Utils.logv(classname, "Data retrievel from "+AppSettings.dataUrl+" failed", ex);
				urlConnection.disconnect();
				return false;
			}finally {
				urlConnection.disconnect();
			}
		} catch (IOException ex) {
			Utils.logv(classname, "HttpURLConnection establishment failed", ex);
			return false;
		}

		return true;
	}
}
