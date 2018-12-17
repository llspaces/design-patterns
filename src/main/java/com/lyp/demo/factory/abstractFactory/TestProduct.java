package com.lyp.demo.factory.abstractFactory;

import com.lyp.demo.factory.Product;

/**
 * <p>@filename TestProduct</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:39
 **/
public class TestProduct {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Product p1 = factory1.createProduct();
        p1.showProduct();
        factory1.createGift();

        Factory2 factory2 = new Factory2();
        Product p2 = factory2.createProduct();
        p2.showProduct();
        factory2.createGift();

    }
}
