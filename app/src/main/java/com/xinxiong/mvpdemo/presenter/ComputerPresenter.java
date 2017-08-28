package com.xinxiong.mvpdemo.presenter;

import com.xinxiong.mvpdemo.model.entity.ComputerBean;
import com.xinxiong.mvpdemo.model.impl.ComputerModelImpl;
import com.xinxiong.mvpdemo.view.ComputerActivity;

/**
 * Created by zhangxin on 17/8/23.
 */

public class ComputerPresenter {
    ComputerModelImpl model ;
    ComputerActivity computerActivity;
    public ComputerPresenter(ComputerActivity computerActivity){
        this.computerActivity = computerActivity;
        model = new ComputerModelImpl();
    }

    public void save(String dispay,String keyboard,String mouse,String master){
        model.saveData(dispay,keyboard,mouse,master);
    }
    public ComputerBean getDate(){
       return model.getData();
    }
}
