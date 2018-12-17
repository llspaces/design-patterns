package com.lyp.demo.factory.simpleFactory;

import com.lyp.demo.factory.Product;
import com.lyp.demo.factory.Product1;
import com.lyp.demo.factory.Product2;

/**
 * <p>@filename ProductFactory</p>
 * <p>
 * <p>@description TODO</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2018/12/17 11:30
 **/
public class ProductFactory {

    public static Product create(String type){
        Product product = null;
        if("1".equals(type)){
            product = new Product1();
        }else if("2".equals(type)){
            product = new Product2();
        }else{

        }
        return product;
    }

}
