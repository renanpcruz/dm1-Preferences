package com.example.preferenceactivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.preference.PreferenceActivity;

import androidx.annotation.Nullable;

public class Principal extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.layout_preferencias);
    }
}
