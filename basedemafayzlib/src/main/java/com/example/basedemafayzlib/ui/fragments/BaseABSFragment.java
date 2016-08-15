package com.example.basedemafayzlib.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.basedemafayzlib.tasks.BaseFragmentLoader;

/**
 * Created by demafayz on 15.08.16.
 */
public abstract class BaseABSFragment extends Fragment implements LoaderManager.LoaderCallbacks<Object>, BaseFragmentLoader.OnBackground {

    private static final int FRAGMENT_LODER_CODE = 100;

    private Loader<Object> loader;
    private LoaderManager loaderManager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        populateLoader();
    }

    private void populateLoader() {
        loaderManager = getLoaderManager();
        loader = loaderManager.restartLoader(FRAGMENT_LODER_CODE, null, this);
        loader.forceLoad();
    }

    @Override
    public Loader<Object> onCreateLoader(int id, Bundle args) {
        onPreExecute();
        BaseFragmentLoader baseFragmentLoader = new BaseFragmentLoader(getContext());
        baseFragmentLoader.setOnBackground(this);
        return baseFragmentLoader;
    }

    @Override
    public void onLoadFinished(Loader<Object> loader, Object data) {
        onPostExecute();
    }

    @Override
    public void onLoaderReset(Loader<Object> loader) {

    }

    @Override
    public void onBackGround(Context context) {
        doInBackground(context);
    }

    protected abstract void onPreExecute();

    protected abstract void doInBackground(Context context);

    protected abstract void onPostExecute();
}
