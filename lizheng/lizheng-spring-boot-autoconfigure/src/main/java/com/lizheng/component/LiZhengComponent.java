package com.lizheng.component;

import com.lizheng.config.SoutConfig;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//在使用项目用@import注入这个类也可以
public class LiZhengComponent implements ImportSelector {
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{SoutConfig.class.getName()};
    }
}
