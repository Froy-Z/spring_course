package com.frizer.spring.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // процесс передачи прав на управление объектом Spring Container
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
