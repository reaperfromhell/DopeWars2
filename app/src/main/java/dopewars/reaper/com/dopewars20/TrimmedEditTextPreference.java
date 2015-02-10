package dopewars.reaper.com.dopewars20;

import android.annotation.TargetApi;
import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

/**
 * Class that extends EditTextPreference to trim the values passed to it.
 */
class TrimmedEditTextPreference extends EditTextPreference {

    @TargetApi(21)
    public TrimmedEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @SuppressWarnings("unused")
    public TrimmedEditTextPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @SuppressWarnings("unused")
    public TrimmedEditTextPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressWarnings("unused")
    public TrimmedEditTextPreference(Context context) {
        super(context);
    }

    @Override
    public void setText(String text) {
        super.setText(text.trim());
    }
}
