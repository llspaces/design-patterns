package com.lyp.demo.facade;

/**
 * <p>@filename Main</p>
 * <p>
 * <p>@description client调用facade</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/16 17:37
 **/
public class Main {

    public static void main(String[] args) {
        ServiceFacade sf = new ServiceFacade();
        sf.serve();
        sf.serve1();
        sf.serve2();
    }
}
