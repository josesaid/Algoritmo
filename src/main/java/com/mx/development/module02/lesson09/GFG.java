package com.mx.development.module02.lesson09;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GFG {
    public void printMessage(String message) {
        System.out.println("you invoked me with the message:" + message);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Invoke method by Name in Java using Reflection!");

        // create class object to get its details
        GFG obj = new GFG();

        Class<?> classObj = obj.getClass();

        // get method object for "printMessage" function by
        // name
        Method printMessage = classObj.getDeclaredMethod("printMessage", String.class);

        try {

            // invoke the function using this class obj
            // pass in the class object
            printMessage.invoke(obj, "hello");
        } catch (InvocationTargetException e) {
            System.out.println(e.getCause());
        }
    }
}
