package com.example.jetpacktest.fragment;


import com.example.jetpacktest.R;
import com.example.jetpacktest.base.BaseFragment;
import com.example.jetpacktest.databinding.FragmentBlankBinding;


public class BlankFragment extends BaseFragment<FragmentBlankBinding> {


    @Override
    public int setLayout() {
        return R.layout.fragment_blank;
    }

    @Override
    public void init() {
        dataBinding.blankText.setText("林俊杰");

    }

}
