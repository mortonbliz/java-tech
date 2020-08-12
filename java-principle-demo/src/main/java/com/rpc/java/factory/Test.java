package com.rpc.java.factory;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * @author mortonbliz
 * @Description:
 * @date 2020/7/23 7:18
 */
public class Test {

    public static void main(String[] args) {
//        ICar car = new BmwCar();
//        car.run();

//        CarFactory factory = new CarFactory();
//        ICar car = factory.create("Ben");
//        car.run();

        CarFactory factory = new CarFactory();
        ICar car = factory.create(BmwCar.class);
        car.run();

    }
}
