package com.example.jetpacktest;

import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;


import com.example.jetpacktest.base.BaseActivity;
import com.example.jetpacktest.databinding.ActivityMainBinding;


/**
 * 测试基类BaseActivity，记住，这个泛型必须要在布局中设置父布局layout，才会生成，否则不生成
 */
public class MainActivity extends BaseActivity<ActivityMainBinding> {

//
//    private FragmentManager fragmentManager;

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
//        TextView contentText = dataBinding.contentText;
//        dataBinding.contentText.setText("测试一下databinding");
//        contentText.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                fragmentManager = getSupportFragmentManager();
////                fragmentManager.beginTransaction()
////                        .add(R.id.content_Panel, new TextFragment())
////                        .commitAllowingStateLoss();
//
//
//
//
//
//            }
//        });

//        /**
//         * 活动中用来设置toobar的方法
//         */
//        setSupportActionBar(dataBinding.bottomAppBar);
//
//

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        //databingding获取不到这个。
//        NavHostFragment navHostFragment = (NavHostFragment) fragmentManager.findFragmentById(R.id.nav_fragments);
//
//        NavController navController = navHostFragment.getNavController();
//        NavigationUI.setupWithNavController(dataBinding.bottomNavView, navController);

        //简化
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_fragments);

        NavigationUI.setupWithNavController(dataBinding.bottomNavView, navHostFragment.getNavController());

    }


//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.bottom_navigation_view_menu, menu);
//        return true;
//    }
//


}
