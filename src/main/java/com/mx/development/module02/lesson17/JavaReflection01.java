package com.mx.development.module02.lesson17;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;

public class JavaReflection01 {
    public static void main(String[] args) {
        Method[]nombresMetodos = Operations.class.getDeclaredMethods();
        for (Method metodo : nombresMetodos){
            System.out.println("---------------");
            System.out.println(metodo.getName()+" tiene: "+ metodo.getParameterCount()+" parametros");
            /*TypeVariable<Method>[] parameterTypes =  metodo.getTypeParameters();
            for(TypeVariable<Method> parameterType : parameterTypes){
                System.out.println("parameter name: " + parameterType.getName()+", type: "+parameterType.getTypeName());
            }*/
            for(Parameter parameter : metodo.getParameters()){
                System.out.println(parameter.getName()+": "+parameter.getType()+" "+parameter.getParameterizedType().getTypeName());
            }
            System.out.println("---------------");
        }
    }
}
