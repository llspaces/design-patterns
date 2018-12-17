package com.lyp.demo.factory.abstractFactory;

import com.lyp.demo.factory.Product;

/**
 * <p>@filename ProductFactory</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:45
 **/
public interface ProductFactory {
    Product createProduct();
    Gift createGift();
}
