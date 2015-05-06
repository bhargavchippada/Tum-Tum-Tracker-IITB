package support;

import com.google.android.gms.maps.model.LatLng;

public class AppSettings {

	/**
	 * URL for fetching ttt json data
	 */
	public static final String dataUrl = "http://tumtum-iitb.org/ttt_data/";

	/**
	 * Data update frequency in milliseconds
	 */
	public static final int frequency = 3000;

	/**
	 * Wait time in milliseconds on last update failure
	 */
	public static final int failWait = 1500;

	/**
	 * Default map center. Use when server data is not available.
	 */
	public static final LatLng center = new LatLng(19.131481, 72.915296);

	/**
	 * Default map zoom level. Server may not send this value.
	 */
	public static final int zoom = 17;

	/**
	 * Default map bearing value. Server may not send this value.
	 */
	public static final int bearing = 0; // Orientation to north

	/**
	 * Default map tilt value. Server may not send this value.
	 */
	public static final int tilt = 60;

	/**
	 * Maximum idle time of a marker (in seconds). For values greater
	 * than this, the particular marker won't be shown on the map.
	 */
	public static final int maxIdle = 1800;
}
