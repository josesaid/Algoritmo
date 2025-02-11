package com.mx.development.module02.lesson17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JavaReflection02 {
    public static void main(String[] args) {

        Method sumInstanceMethod = null;
        try {
            sumInstanceMethod = Operations.class.getMethod("publicSum", int.class, double.class);
        } catch (NoSuchMethodException e) {
            System.err.println(e.getMessage());
        }

        Operations operationsInstance = new Operations();

        Double result = null;
        try {
            result = (Double) sumInstanceMethod.invoke(operationsInstance, 1, 3);
        } catch (IllegalAccessException e) {
            System.err.println(e.getMessage());
        } catch (InvocationTargetException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(result==4.0d);

        //----
        //operationsInstance.miMetodoXYZ(1, 2, 3.1415f, "hola", null);

        Method miMetodoXYZ = null;
        try {
            miMetodoXYZ = Operations.class.getDeclaredMethod("miMetodoXYZ", int.class, int.class, float.class, String.class, Object.class);
            miMetodoXYZ.setAccessible(true);
        } catch (NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
        try {
            Boolean result2 = (Boolean) miMetodoXYZ.invoke(operationsInstance, 1, 2, 3.1415f, "hola", null);
            System.out.println("result2: " + result2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }

        System.out.println("adios");

    }
}


