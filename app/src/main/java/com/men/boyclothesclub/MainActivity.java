package com.men.boyclothesclub;

import android.support.v4.app.Fragment;
import android.widget.RadioGroup;

import com.men.boyclothesclub.Base.ui.BaseActivity;
import com.men.boyclothesclub.Base.ui.BaseFragment;
import com.men.boyclothesclub.FristPage1.FristPageFragment;
import com.men.boyclothesclub.Group3.GroupFragment;
import com.men.boyclothesclub.Mine5.MineFragment;
import com.men.boyclothesclub.School4.SchoolFragment;
import com.men.boyclothesclub.Single2.ui.SingleFragment;

import java.util.Timer;

import static com.men.boyclothesclub.R.id.id_btn_group;
import static com.men.boyclothesclub.R.id.id_btn_radio;

public class MainActivity extends BaseActivity {

    private android.support.v4.app.FragmentManager manager;
    private android.support.v4.app.FragmentTransaction transaction;
    private BaseFragment fragment1, fragment2, fragment3, fragment4, fragment5;
    private Fragment[] fragments;
    private RadioGroup group;
    private static Timer timer;
    public static Timer getTimer() {
        if(timer==null){
            return new Timer();
        }
        return timer;
    }


    @Override
    protected int setRootView() {
        return R.layout.activity_main;
    }

    @Override
    protected void init() {

        fragment1 = new FristPageFragment();
        fragment2 = new SingleFragment();
        fragment3 = new GroupFragment();
        fragment4 = new SchoolFragment();
        fragment5 = new MineFragment();
        fragments = new Fragment[]{fragment1, fragment2, fragment3, fragment4, fragment5};
        //获取碎片事务管理
        manager = this.getSupportFragmentManager();
        transaction = manager.beginTransaction();
        //添加
        transaction.add(R.id.id_ll_content, fragments[0]);
        transaction.add(R.id.id_ll_content, fragments[1]);
        transaction.add(R.id.id_ll_content, fragments[2]);
        transaction.add(R.id.id_ll_content, fragments[3]);
        transaction.add(R.id.id_ll_content, fragments[4]);
        transaction.hide(fragments[1]);
        transaction.hide(fragments[2]);
        transaction.hide(fragments[3]);
        transaction.hide(fragments[4]);
        transaction.commit();
    }

    @Override
    protected void initEvent() {
        group = (RadioGroup) findViewById(id_btn_radio);
        group.setOnCheckedChangeListener(new RadioListener());
    }

    private int selectionIndex;

    class RadioListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.id_btn_first_page:
                    selectionIndex = 0;
                    break;
                case R.id.id_btn_single:
                    selectionIndex = 1;
                    break;
                case id_btn_group:
                    selectionIndex = 2;
                    break;
                case R.id.id_btn_school:
                    selectionIndex = 3;
                    break;
                case R.id.id_btn_mine:
                    selectionIndex = 4;
                    break;
            }
            transaction = manager.beginTransaction();
            //添加回退栈
//            transaction.addToBackStack(String.valueOf(selectionIndex));
            transaction.hide(fragments[0]);
            transaction.hide(fragments[1]);
            transaction.hide(fragments[2]);
            transaction.hide(fragments[3]);
            transaction.hide(fragments[4]);
            transaction.show(fragments[selectionIndex]);
            transaction.commit();
        }
    }
}
