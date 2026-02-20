package com.ua.rush.module2.lesson18;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserProxy implements InvocationHandler {

    private User user;

    public UserProxy(User user) {
        this.user = user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.isAnnotationPresent(Validator.class)) {
            System.out.println("annotation is present " + method.getName());

            int maxLength = method.getAnnotation(Validator.class).maxLength();

        }

        return null;
    }

}
