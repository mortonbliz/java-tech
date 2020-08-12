package com.rpc.java.factory;

/**
 * @author mortonbliz
 * @Description:
 * @date 2020/7/23 7:30
 */
public class BenCar implements ICar {
    @Override
    public void run() {
        System.out.println("大奔驰开始跑了...");
    }
}
