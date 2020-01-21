package com.example.jetpacktest.fragment;

import com.example.jetpacktest.R;
import com.example.jetpacktest.base.BaseFragment;
import com.example.jetpacktest.databinding.FragmentTextBinding;


/**
 * 测试基类BaseFragment，记住，这个泛型必须要在布局中设置父布局layout，才会生成，否则不生成
 *
 */
public class TextFragment extends BaseFragment<FragmentTextBinding> {


    @Override
    public int setLayout() {
        return R.layout.fragment_text;
    }

    @Override
    public void init() {

        dataBinding.textFragment.setText("测试一下碎片");
    }

}
