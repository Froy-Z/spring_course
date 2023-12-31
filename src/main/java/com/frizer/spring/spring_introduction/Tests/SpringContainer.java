package com.frizer.spring.spring_introduction.Tests;

import com.frizer.spring.spring_introduction.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // процесс передачи прав на управление объектом Spring Container
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
