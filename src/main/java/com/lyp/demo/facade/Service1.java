package com.lyp.demo.facade;

/**
 * <p>@filename Service1</p>
 * <p>
 * <p>@description Service1</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 17:32
 **/
public class Service1 implements Service {
    @Override
    public void serve() {
        System.out.println("service1 serve for you!");
    }
}
