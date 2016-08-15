package com.free.demafayz.developermanager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.basedemafayzlib.ui.fragments.TestFragment;
import com.free.demafayz.developermanager.ui.fragments.BaseFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fm;
    private FragmentTransaction ft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testDemaFayzLib();
    }

    private void testDemaFayzLib() {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        ft.replace(R.id.fragment_container, new TestFragment());
        ft.commit();
    }
}
