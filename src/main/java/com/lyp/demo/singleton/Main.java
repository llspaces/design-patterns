package com.lyp.demo.singleton;

/**
 * <p>@filename Main</p>
 * <p>
 * <p>@description 测试单例</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 17:54
 **/
public class Main {

    public static void main(String[] args) {
        Singleton2 singleton1 = Singleton2.getInstance();
        System.out.println(singleton1.hashCode());
        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2.hashCode());
    }
}
