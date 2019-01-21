package com.lyp.demo.proxy;

/**
 * <p>@filename Main</p>
 * <p>
 * <p>@description 测试代理模式</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 18:01
 **/
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        //第一次需要从磁盘加载
        image.display();
        System.out.println("-----");
        //后面不需要从磁盘加载
        image.display();
    }

}
