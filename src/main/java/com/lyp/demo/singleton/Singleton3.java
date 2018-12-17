package com.lyp.demo.singleton;

/**
 * <p>@filename Singleton3</p>
 * <p>
 * <p>@description 静态内部类（推荐用）</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 10:48
 **/
public class Singleton3 {
    //私有化构造方法
    private Singleton3() {}

    //提供静态访问实例的方法
    public static Singleton3 getInstance() {
        return SingletonInstance.INSTANCE;
    }

    //静态内部类
    private static class SingletonInstance {
        private static final Singleton3 INSTANCE = new Singleton3();
    }
}
