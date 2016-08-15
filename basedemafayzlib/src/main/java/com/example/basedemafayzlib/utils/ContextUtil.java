package com.example.basedemafayzlib.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by demafayz on 15.08.16.
 */
public class ContextUtil {

    public static void showFragment(FragmentActivity activity, int fragmentContainer, Fragment fragment, boolean addBackStack, String tagBackStack) {
        FragmentManager fm = activity.getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(fragmentContainer, fragment);
        if (addBackStack) {
            ft.addToBackStack(tagBackStack);
        }
        ft.commit();
    }

    public static void showFragmentNoBackStack(FragmentActivity activity, int fragmentContainer, Fragment fragment) {
        showFragment(activity, fragmentContainer, fragment, false, null);
    }

    public static void showFragment(FragmentActivity activity, int fragmentContainer, Fragment fragment, String backStackTag) {
        showFragment(activity, fragmentContainer, fragment, true, backStackTag);
    }
}
