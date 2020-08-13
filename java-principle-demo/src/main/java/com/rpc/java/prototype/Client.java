package com.rpc.java.prototype;

/**
 * @author mortonbliz
 * @Description:
 * @date 2020/8/13 7:43
 */
public class Client {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("RPC","30");
        System.out.println(prototype);
        Prototype clone = prototype.clone();
        System.out.println(clone);
    }
}
