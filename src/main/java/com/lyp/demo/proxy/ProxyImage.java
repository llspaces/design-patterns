package com.lyp.demo.proxy;

/**
 * <p>@filename ProxyImage</p>
 * <p>
 * <p>@description ProxyImage</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 17:58
 **/
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(this.realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
