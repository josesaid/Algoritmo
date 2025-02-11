package com.mx.development.module02.lesson17;

public class Operations {
    public double publicSum(int a, double b) {
        return a + b;
    }

    public static double publicStaticMultiply(float a, long b) {
        return a * b;
    }

    private boolean privateAnd(boolean a, boolean b) {
        return a && b;
    }

    protected int protectedMax(int a, int b) {
        return a > b ? a : b;
    }
    private boolean miMetodoXYZ(int x, int y, float z, String s, Object o){
        System.out.println("Este metodo es privado y nadie fuera de esta clase lo puede usar...");
        return true;
    }
}
