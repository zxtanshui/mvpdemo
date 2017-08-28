package com.xinxiong.mvpdemo.model.impl;

import com.xinxiong.mvpdemo.model.entity.ComputerBean;

/**
 * Created by zhangxin on 17/8/23.
 */

public class ComputerModelImpl {

    public ComputerBean getData() {
        ComputerBean computerBean = new ComputerBean();
        computerBean.setDisplay("display1");
        computerBean.setKeyboard("keyboard1");
        computerBean.setMouse("mouse1");
        computerBean.setMaster("master1");
        return computerBean;
    }

    /**
     * 存储 显示器 、键盘、鼠标、主机
     * @param display
     * @param keyboard
     * @param mouse
     * @param master
     */
    public void saveData(String display,String keyboard,String mouse,String master) {

    }
}
