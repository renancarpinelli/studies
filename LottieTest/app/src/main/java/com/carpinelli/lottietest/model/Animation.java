package com.carpinelli.lottietest.model;

/**
 * Created by rcarpinelli on 12/04/2018.
 */

public class Animation {

    private String name;
    private String path;

    public Animation(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return name;
    }
}
