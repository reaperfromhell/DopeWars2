package dopewars.reaper.com.dopewars20.debug;

import android.app.Activity;

import static android.view.WindowManager.LayoutParams.FLAG_ALLOW_LOCK_WHILE_SCREEN_ON;
import static android.view.WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD;
import static android.view.WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED;
import static android.view.WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON;

/**
 * Add this to your application's src/debug/... sources
 */
public class DebugU {

    /**
     * Show the activity over the lockscreen and wake up the device. If you launched the app manually
     * both of these conditions are already true. If you deployed from the IDE, however, this will
     * save you from hundreds of power button presses and pattern swiping per day!
     */
    public static void riseAndShine(Activity activity) {
        activity.getWindow().addFlags(FLAG_SHOW_WHEN_LOCKED | FLAG_DISMISS_KEYGUARD);
        activity.getWindow().addFlags(FLAG_TURN_SCREEN_ON | FLAG_ALLOW_LOCK_WHILE_SCREEN_ON);
    }

}