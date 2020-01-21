package com.example.jetpacktest.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jetpacktest.R;
import com.example.jetpacktest.base.BaseFragment;
import com.example.jetpacktest.databinding.FragmentCatorayBinding;
import com.example.jetpacktest.databinding.FragmentTextBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class catorayFragment extends BaseFragment<FragmentCatorayBinding> {



    @Override
    public int setLayout() {
        return R.layout.fragment_catoray;
    }

    @Override
    public void init() {

        dataBinding.catorayText.setText("周杰伦");
    }

}
