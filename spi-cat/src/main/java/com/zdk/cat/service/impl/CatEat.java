package com.zdk.cat.service.impl;

import com.zdk.api.interfaces.Eat;

/**
 * @author zhangdikai
 * @date 2022-07-13 9:33
 */
public class CatEat implements Eat {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
