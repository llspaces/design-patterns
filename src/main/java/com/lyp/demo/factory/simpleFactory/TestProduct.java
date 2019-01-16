package com.lyp.demo.factory.simpleFactory;

import com.lyp.demo.factory.Product;

/**
 * <p>@filename TestProduct</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:33
 **/
public class TestProduct {
    public static void main(String[] args) {
        Product p1 = ProductFactory.create("1");
        p1.showProduct();
        Product p2 = ProductFactory.create("2");
        p2.showProduct();
    }

}
