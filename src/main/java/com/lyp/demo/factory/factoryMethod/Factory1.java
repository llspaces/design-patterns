package com.lyp.demo.factory.factoryMethod;

import com.lyp.demo.factory.Product;
import com.lyp.demo.factory.Product1;

/**
 * <p>@filename Factory1</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:38
 **/
public class Factory1 implements ProductFactory {
    @Override
    public Product create() {
        return new Product1();
    }
}
