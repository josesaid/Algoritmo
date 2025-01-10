package com.mx.development.module02.lesson09;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflectionExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException {
        System.out.println(Casa.class.getSimpleName());
        System.out.println(Casa.class.getCanonicalName());
        for(Method method : Casa.class.getMethods()){
            String methodName = method.getName();
            System.out.println(methodName);
        }
    }
}
