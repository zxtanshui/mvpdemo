package com.xinxiong.mvpdemo.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.xinxiong.mvpdemo.R;
import com.xinxiong.mvpdemo.model.entity.ComputerBean;
import com.xinxiong.mvpdemo.presenter.ComputerPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by zhangxin on 17/8/21.
 */

public class ComputerActivity extends Activity implements View.OnClickListener{
    ComputerPresenter presenter;
    TextView tv_display;
    TextView tv_keyborad;
    TextView tv_mouse;
    TextView tv_master;
     TextView tv_save;
     TextView tv_show;
    ComputerBean computerBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        presenter = new ComputerPresenter(ComputerActivity.this);
        tv_display = (TextView) findViewById(R.id.tv_dispaly);
        tv_keyborad = (TextView) findViewById(R.id.tv_keyboard);
        tv_mouse = (TextView) findViewById(R.id.tv_mouse);
        tv_master = (TextView) findViewById(R.id.tv_master);
        tv_save = (TextView) findViewById(R.id.tv_save);
        tv_show = (TextView) findViewById(R.id.tv_show);
        tv_save.setOnClickListener(this);
        tv_show.setOnClickListener(this);
        loadData();
    }


    public static void startActivity(Activity activity){
        Intent intent = new Intent(activity,ComputerActivity.class);
        activity.startActivity(intent);
    }

    public void loadData(){
        showloading();
        computerBean = presenter.getDate();
        hideloading();
    }

    public void showDisplay(String display){
        tv_display.setText(computerBean.getDisplay());
    }

    public void showKeyboard(String keyboard){
        tv_keyborad.setText(computerBean.getKeyboard());
    }

    public void showMouse(String mouse){
        tv_mouse.setText(computerBean.getMouse());
    }

    public void showMaster(String master){
        tv_master.setText(computerBean.getMouse());
    }

    public void save(){
        presenter.save(computerBean.getDisplay(),computerBean.getKeyboard(),computerBean.getMouse(),computerBean.getMaster());
    }

    public void showloading() {

    }

    public void hideloading() {

    }
    @OnClick({R.id.tv_save,R.id.tv_show})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.tv_save:
                save();
                break;
            case R.id.tv_show:
                showDisplay(computerBean.getDisplay());
                showMouse(computerBean.getMouse());
                showKeyboard(computerBean.getKeyboard());
                showMaster(computerBean.getMaster());
                break;
        }
    }
}
