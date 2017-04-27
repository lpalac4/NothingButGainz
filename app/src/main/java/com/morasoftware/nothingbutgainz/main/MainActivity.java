package com.morasoftware.nothingbutgainz.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.morasoftware.nothingbutgainz.R;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter = new MainPresenter();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mPresenter.getUserDiaries();

    }
}
