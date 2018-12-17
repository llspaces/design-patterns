package com.lyp.demo.singleton;

/**
 * <p>@filename Singleton4</p>
 * <p>
 * <p>@description 枚举（推荐用）</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:06
 **/
public enum Singleton4 {

    /**
     * 适用场景：
     * 需要频繁的进行创建和销毁的对象；
     * 创建对象时耗时过多或耗费资源过多，但又经常用到的对象；
     * 工具类对象；
     * 频繁访问数据库或文件的对象。
     */
    INSTANCE;

    public void whateverMethod() {

    }
}
