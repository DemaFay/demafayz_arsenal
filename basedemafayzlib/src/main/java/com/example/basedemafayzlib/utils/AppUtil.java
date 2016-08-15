package com.example.basedemafayzlib.utils;

import android.util.Log;

/**
 * Created by demafayz on 15.08.16.
 */
public class AppUtil {
    public static final boolean DEBUG = true;

    public static void dLog(Class logClass, String text) {
        if (DEBUG) {
            Log.d(logClass.getSimpleName(), text);
        }
    }
}
