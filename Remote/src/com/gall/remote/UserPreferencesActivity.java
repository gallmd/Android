package com.gall.remote;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class UserPreferencesActivity extends PreferenceActivity {

    @SuppressWarnings("deprecation")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_screen);
 
    }
    
}
