package com.lyp.demo.proxy;

/**
 * <p>@filename RealImage</p>
 * <p>
 * <p>@description RealImage</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 17:56
 **/
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName + " from disk.");
    }

}
