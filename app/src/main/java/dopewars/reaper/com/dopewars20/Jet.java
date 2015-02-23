package dopewars.reaper.com.dopewars20;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

import dopewars.reaper.com.dopewars20.debug.DebugU;

public class Jet extends ActionBarActivity {

   // public static String sDefSystemLanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   sDefSystemLanguage = Locale.getDefault().getLanguage();
        //setContentView(R.layout.activity_jet);
        if (BuildConfig.DEBUG) {
            // Calling this from your launcher activity is enough, but I needed a good example spot ;)
            DebugU.riseAndShine(this);
        }
        String languageToLoad = PreferenceManager.getDefaultSharedPreferences(getBaseContext()).getString("language_preference","");
        Locale locale;
        if(languageToLoad.equals("")){
            locale = Resources.getSystem().getConfiguration().locale;
        }else {
            locale = new Locale(languageToLoad);
        }
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());
        this.setContentView(R.layout.activity_jet);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jet, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.settings_title:
                //Settings
                Intent intent = new Intent(this, ShowSettings.class);
                startActivity(intent);
                break;
            case R.id.highscores:
                return true;
            default:
                //nada
        }
        return super.onOptionsItemSelected(item);
    }

    /*@Override
    public void onConfigurationChanged(Configuration newConfig) {
        // refresh your views here
        super.onConfigurationChanged(newConfig);
    }*/

    public void goNeighborhood(View view) {
        Intent intent = new Intent(this, Neighborhood.class);
        Button pressedBtn = (Button) view;
        String Neighborhood = pressedBtn.getText().toString();
        intent.putExtra("zone", Neighborhood);
        startActivity(intent);
    }
}
