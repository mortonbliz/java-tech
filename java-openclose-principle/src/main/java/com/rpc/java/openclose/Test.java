package com.rpc.java.openclose;

public class Test {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaDiscountCourse(1,"Java课程",new Double(6980));
        System.out.println(javaCourse);
        System.out.println("优惠价格："+javaCourse.getPrice());
    }
}
