package com.lyp.demo.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>@filename InitData</p>
 * <p>
 * <p>@description java优雅初始化数据的方式</p>
 *
 * @author liyupeng
 * @version 1.0
 * @since 2019/1/7 16:57
 **/
public class StaticInitData {

    public static List<Integer> dataList = null;

    static {
        dataList = Singleton.INSTANCE.init();
    }

    //利用枚举实现单例
    private enum Singleton {
        INSTANCE;

        private List<Integer> list;

        Singleton(){
            initData();
        }

        private void initData(){
            this.list = new ArrayList<Integer>(5);
            for(int i = 1; i <= 5 ; i++){
                list.add(i);
            }
        }

        public List<Integer> init(){
            return this.list;
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(StaticInitData.dataList.hashCode());
            }
        },"t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(StaticInitData.dataList.hashCode());
            }
        },"t2");
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(StaticInitData.dataList.hashCode());
            }
        },"t3");

        t1.start();
        t2.start();
        t3.start();
    }
}


