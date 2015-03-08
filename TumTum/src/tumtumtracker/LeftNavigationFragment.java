package tumtumtracker;

import android.support.v4.app.Fragment;

import com.iitbombay.tumtumtracker.R;

public class LeftNavigationFragment extends Fragment{
	
	// Left navigation app menu items
	String[] appMenuItems = new String[] { "Show idle buses", "About",
			"Report bug", "Rate", "Open source licences" };

	int[] appMenuIcons = new int[] { R.drawable.icon_visibility,
			R.drawable.icon_info_greyscale, R.drawable.icon_bug_report,
			R.drawable.icon_star, R.drawable.icon_opensource };
}
