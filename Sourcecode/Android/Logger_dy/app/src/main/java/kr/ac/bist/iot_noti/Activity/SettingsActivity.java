package kr.ac.bist.iot_noti.Activity;

import android.content.SharedPreferences;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import kr.ac.bist.iot_noti.R;

public class SettingsActivity extends PreferenceActivity {
    private String phoneNbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_settings);
        SharedPreferences appPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        phoneNbr = appPreferences.getString("key_userNbr","");

        Log.d("TAG", phoneNbr+"");
    }
}
