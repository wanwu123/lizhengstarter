package com.lizheng.component;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "lizheng")
public class SoutConfiguration {
    private String wenZi = "lizhengTest";

    private int num;

    private String pattern = "yyyy-MM-dd hh:mm:ss";

    public String getWenZi() {
        return wenZi;
    }

    public void setWenZi(String wenZi) {
        this.wenZi = wenZi;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
