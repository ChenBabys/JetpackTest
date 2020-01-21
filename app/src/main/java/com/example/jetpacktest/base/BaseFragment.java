package com.example.jetpacktest.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

/**
 * fragment的基类
 *
 * @param <DB>
 */
public abstract class BaseFragment<DB extends ViewDataBinding> extends Fragment {

    public DB dataBinding;
    public Context mContext;
    public Activity mActivity;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        dataBinding = DataBindingUtil.inflate(inflater, setLayout(), container, false);
        mContext = getContext();
        mActivity = getActivity();
        init();
        return dataBinding.getRoot();
    }


    public abstract int setLayout();


    public abstract void init();

}
