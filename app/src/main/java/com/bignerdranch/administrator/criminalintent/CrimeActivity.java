package com.bignerdranch.administrator.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class CrimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (savedInstanceState == null) {
            fm.beginTransaction()
                    .add(R.id.fragment_container, new CrimeFragment())
                    .commit();
            Log.d("CrimeActivity", "添加fragment");
        }

        /**
         *  if (fragment == null) {
         *      fragment = new CrimeFragment();
         *      fm.beginTransaction().add(R.id.fragment_container, fragment).commit();
         *  }
         */
    }
}