package com.example.basedemafayzlib.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demafayz.basedemafayzlib.R;
import com.example.basedemafayzlib.utils.AppUtil;

/**
 * Created by demafayz on 15.08.16.
 */
public class TestFragment extends BaseABSFragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppUtil.dLog(TestFragment.class, "onCreate called");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AppUtil.dLog(TestFragment.class, "onCreateView called");
        View layout = inflater.inflate(R.layout.fragment_test, container, false);
        return layout;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        AppUtil.dLog(TestFragment.class, "onViewCreated called");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    protected void onPreExecute() {
        AppUtil.dLog(TestFragment.class, "onPreExecute called");
    }

    @Override
    protected void doInBackground(Context context) {
        AppUtil.dLog(TestFragment.class, "doInBackground called");
    }

    @Override
    protected void onPostExecute() {
        AppUtil.dLog(TestFragment.class, "onPostExecute called");
    }
}
