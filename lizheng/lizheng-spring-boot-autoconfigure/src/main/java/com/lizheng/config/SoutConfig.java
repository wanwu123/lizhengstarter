package com.lizheng.config;


import com.lizheng.util.SoutUtil;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class SoutConfig {
    @Bean
    public SoutUtil soutUtil(){
        return new SoutUtil();
    }
}
