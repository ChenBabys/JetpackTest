package com.example.jetpacktest.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

/**
 * 活动基类,通过泛型把集成了BaseActivity的binding传入（这里用DB泛型）
 */
public abstract class BaseActivity<DB extends ViewDataBinding> extends AppCompatActivity {
    public DB dataBinding;
    public Context mContext;
    public Activity mActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, setLayout());
        mContext = this;
        mActivity = this;
        init();
    }

    /**
     * 布局
     *
     * @return
     */
    public abstract int setLayout();

    /**
     * 初始化
     */
    public abstract void init();

}
