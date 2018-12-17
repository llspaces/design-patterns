package com.lyp.demo.singleton;

/**
 * <p>@filename Singleton1</p>
 * <p>
 * <p>@description 饿汉式（可用）</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 10:06
 **/
public class Singleton1 {

    //静态对象
    private static Singleton1 singleton = new Singleton1();

    //私有化构造方法
    private Singleton1() {
    }

    //提供静态访问实例的方法
    public static Singleton1 getInstance(){
        return singleton;
    }
}
