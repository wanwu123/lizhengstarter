package com.lizheng.util;

import com.lizheng.component.SoutConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

public class SoutUtil {

    @Autowired
    private SoutConfiguration soutConfiguration;

    public String getCofig(){
        return soutConfiguration.getWenZi()+soutConfiguration.getPattern()+soutConfiguration.getNum();
    }
}
