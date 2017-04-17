package com.dasu.ganhuo.ui.meizi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

import com.dasu.ganhuo.R;
import com.dasu.ganhuo.ui.base.DrawerActivity;

/**
 * Created by suxq on 2017/4/14.
 */

public class MeiziActivity extends DrawerActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meizi);
        addToolbar((Toolbar)findViewById(R.id.toolbar));
        getSupportActionBar().setTitle("妹子");
    }

    @Override
    protected int bindMenuId() {
        return MENU_MEIZI;
    }
}
