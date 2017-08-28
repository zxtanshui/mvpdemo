package com.xinxiong.mvpdemo.model.entity;

/**
 * Created by zhangxin on 17/8/23.
 */

public class ComputerBean {
    private String display;
    private String master;
    private String mouse;
    private String keyboard;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "ComputerBean{" +
                "display='" + display + '\'' +
                ", master='" + master + '\'' +
                ", mouse='" + mouse + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }
}
