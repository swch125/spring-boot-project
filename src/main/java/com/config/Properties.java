package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Eric.sun on 2017/3/28.
 */
@ConfigurationProperties(prefix="com.eric")
public class Properties {

    private String name;

    private String title;

    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
