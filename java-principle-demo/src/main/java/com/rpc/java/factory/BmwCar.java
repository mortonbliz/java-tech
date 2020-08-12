package com.rpc.java.factory;

/**
 * @author mortonbliz
 * @Description:
 * @date 2020/7/23 7:15
 */
public class BmwCar implements ICar {

    @Override
    public void run() {
        System.out.println("宝马开始跑了...");
    }
}
