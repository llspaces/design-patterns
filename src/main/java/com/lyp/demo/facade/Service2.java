package com.lyp.demo.facade;

/**
 * <p>@filename Service2</p>
 * <p>
 * <p>@description Service2</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 17:33
 **/
public class Service2 implements Service{
    @Override
    public void serve() {
        System.out.println("service2 serve for you!");
    }
}
