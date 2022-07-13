package com.zdk.dog.service.impl;

import com.zdk.api.interfaces.Eat;

/**
 * @author zhangdikai
 * @date 2022-07-12 16:29
 */
public class DogEat implements Eat {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
