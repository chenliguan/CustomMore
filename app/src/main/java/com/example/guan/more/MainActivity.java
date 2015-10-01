package com.example.guan.more;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Window;
import android.widget.ImageView;

import com.example.guan.login.LoginActivity;
import com.example.guan.R;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends ActionBarActivity {

    @Bind(R.id.back)
    ImageView back;
    @Bind(R.id.more1)
    MyView more1;
    @Bind(R.id.more2)
    MyView more2;
    @Bind(R.id.more3)
    MyView more3;
    @Bind(R.id.more4)
    MyView more4;
    @Bind(R.id.more5)
    MyView more5;
    @Bind(R.id.more6)
    MyView more6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
        // ��ע��ʽ���
        ButterKnife.bind(this);
    }

    @OnClick({R.id.more1, R.id.more2,R.id.more3,R.id.more4,R.id.more5,R.id.more6 })
    public void gotoLogin() {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

}
