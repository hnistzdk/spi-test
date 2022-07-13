package com.zdk.service;

import com.zdk.api.interfaces.Eat;

import java.util.ServiceLoader;

/**
 * @author zhangdikai
 * @date 2022-07-12 16:35
 */
public class EatService {

    public static void main(String[] args) {
        ServiceLoader<Eat> serviceLoader = ServiceLoader.load(Eat.class);
        for (Eat eat : serviceLoader) {
            eat.eat();
        }
    }
}
