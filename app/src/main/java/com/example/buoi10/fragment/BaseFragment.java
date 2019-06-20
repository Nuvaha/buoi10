package com.example.buoi10.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.buoi10.MainActivity;

//buoc1
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(getLayoutRes(), container, false);
        return v;
    }
    //buoc16
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(getClass().getName(),"onActivityCreated");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(getClass().getName(), "onDestroy");
    }

    protected abstract int getLayoutRes();

    public abstract String getTitle();

    //buoc14
    protected MainActivity getParent(){
        return (MainActivity) getActivity();
    }

}
