package com.example.basedemafayzlib.tasks;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

/**
 * Created by demafayz on 15.08.16.
 */
public class BaseFragmentLoader extends AsyncTaskLoader<Object> {

    private OnBackground onBackground;

    public interface OnBackground {
        public void onBackGround(Context context);
    }


    public BaseFragmentLoader(Context context) {
        super(context);
    }

    @Override
    public Object loadInBackground() {
        if (onBackground != null) onBackground.onBackGround(getContext());
        return null;
    }

    public void setOnBackground(OnBackground onBackground) {
        this.onBackground = onBackground;
    }
}
