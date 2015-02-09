package dopewars.reaper.com.dopewars20;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


public class ShowSettings extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("");
        setContentView(tv);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsActivity()).commit();
    }

}
