package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
@ConfigurationProperties()
public class HoldProperties {
    private String var1;
    private String var3;
}
