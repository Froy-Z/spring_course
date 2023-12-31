package com.frizer.spring.reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null;
        System.out.println(number + name);
        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(number + name);
    }
}
