package tumtumtracker;

import networkhandler.GetTTTData;
import support.Utils;
import support.Utils.TimeProfile;
import android.app.Activity;
import android.os.Bundle;

import com.iitbombay.tumtumtracker.R;

public class TrackingActivity extends Activity{
	public static String classname = "TrackingActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_tracking);

		for(int i=0; i<10; i++){
			new Thread() {
				@Override public void run() {
					TimeProfile tp = new TimeProfile();
	
					boolean b = GetTTTData.threadSafeTTTDataSync();
					Utils.logv(classname, b+"");
	
					tp.print(classname);
				}
			}.start();
		}
	}
}
