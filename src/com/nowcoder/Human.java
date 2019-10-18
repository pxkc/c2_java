package com.nowcoder;

/**
 * Created by nowcoder on 2016/6/25.
 */
public class Human extends Animal {
    private String country;

    public Human(String name, int age, String county) {
        super(name, age);
        this.country = county;
    }

    public void say() {
        System.out.println("This is " + getName() + " from " + country);
        System.out.println("hello 增加一句代码留查看自己的版本控制");
    }
}
