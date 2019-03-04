package com.spring.IoC.work;

import java.util.List;

/**
 * Created by lenovo on 2019/3/4.
 */
public class Meeting {
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", boss=" + boss +
                '}';
    }

    public List<Boss> getBoss() {
        return boss;
    }

    public void setBoss(List<Boss> boss) {
        this.boss = boss;
    }
    private String theme;

    private List<Boss> boss;
}
