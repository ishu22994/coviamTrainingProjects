package com.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws Exception{
        Employee emp = new Employee();

        Class cls = emp.getClass();
        System.out.println(cls);
        System.out.println(cls.getDeclaredFields());

        try{
            Field fld = cls.getDeclaredField("firstName");
            System.out.println(fld);
            Method md = cls.getDeclaredMethod("setFirstName", String.class);
            System.out.println(md);
            System.out.println(fld.get(emp));

        }catch(NoSuchFieldException ex){

        }
        System.out.println(cls.getDeclaredAnnotations());
    }

}
