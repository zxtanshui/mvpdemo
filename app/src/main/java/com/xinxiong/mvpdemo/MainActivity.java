package com.xinxiong.mvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.xinxiong.mvpdemo.view.ComputerActivity;

public class MainActivity extends AppCompatActivity {
    Button btn_mvp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mvp = (Button) findViewById(R.id.btn_jump);
        btn_mvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ComputerActivity.startActivity(MainActivity.this);
            }
        });
    }
}
