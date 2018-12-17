package com.lyp.demo.factory.factoryMethod;

import com.lyp.demo.factory.Product;
import com.lyp.demo.factory.Product2;

/**
 * <p>@filename Factory2</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:39
 **/
public class Factory2 implements ProductFactory {
    @Override
    public Product create() {
        return new Product2();
    }
}
