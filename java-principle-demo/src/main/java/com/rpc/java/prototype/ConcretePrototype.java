package com.rpc.java.prototype;

/**
 * @author mortonbliz
 * @Description:
 * @date 2020/8/13 7:41
 */
public class ConcretePrototype implements Prototype{

    private String name;

    private String age;

    public ConcretePrototype(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Prototype clone() {
        ConcretePrototype prototype = new ConcretePrototype(this.name,this.age);
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
