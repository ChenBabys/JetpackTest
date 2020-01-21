package com.example.jetpacktest.fragment;


import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.example.jetpacktest.R;
import com.example.jetpacktest.base.BaseFragment;
import com.example.jetpacktest.databinding.FragmentHomeBinding;
import com.google.android.material.snackbar.Snackbar;


public class homeFragment extends BaseFragment<FragmentHomeBinding> {


    @Override
    public int setLayout() {
        return R.layout.fragment_home;
    }

    @SuppressLint("NewApi")
    @Override
    public void init() {


        //悬浮按钮尝试
        dataBinding.fab.setOnClickListener(v -> {
            Snackbar.make(v, "尝试snackbar", Snackbar.LENGTH_SHORT)
                    .setAction("自定义按钮", v1 -> {
                        Toast.makeText(mContext, "哈哈哈啊", Toast.LENGTH_SHORT).show();
                    }).show();
        });


        //在activity中就是setSupportActionBar,下面get同理
        //如果没有设置actionBar相关，会出现toobar没有返回键。
        mActivity.setActionBar(dataBinding.toobar);

        ActionBar actionBar = mActivity.getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        // <-- end actionBar相关 !-->

        dataBinding.collToobar.setTitle("林俊杰");

        dataBinding.toobar.setTitle("我是林俊杰啊");


        dataBinding.backgroupImageView.setBackgroundResource(R.mipmap.bg_worker_top);

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 500; i++) {
            stringBuilder.append("新年快乐");
        }
        //记得要转换成字符串
        dataBinding.textHome.setText(stringBuilder.toString());
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        return super.onOptionsItemSelected(item);
    }


}
