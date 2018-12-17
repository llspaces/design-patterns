package com.lyp.demo.singleton;

/**
 * <p>@filename Singleton2</p>
 * <p>
 * <p>@description 懒汉式（推荐用）</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 10:46
 **/
public class Singleton2 {

    //静态对象
    private static Singleton2 singleton;

    //私有化构造方法
    private Singleton2() {
    }

    //提供静态访问实例的方法(双重检查 + 锁类信息 DCL，即 double-checked locking)
    public static Singleton2 getInstance() {
        if (singleton == null) {
            synchronized (Singleton2.class) {
                if (singleton == null) {
                    singleton = new Singleton2();
                }
            }
        }
        return singleton;
    }
}
