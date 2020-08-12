package com.rpc.java.factory;

/**
 * @author mortonbliz
 * @Description:
 * @date 2020/7/23 7:31
 */
public class CarFactory {
//    public ICar create(String brand){
//        if("Bmw".equals(brand)){
//            return new BmwCar();
//        }else if ("Ben".equals(brand)){
//            return new BenCar();
//        }
//        return null;
//    }

    public ICar create(Class<? extends ICar> classz){
        try {
            if(classz != null){
                return classz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
