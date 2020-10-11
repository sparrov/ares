package com.szymonwrobel.module.dashboard;

public class MenuDto {

    private String name;
    private String url;

    public MenuDto(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
