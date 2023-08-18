package com.frizer.spring.spring_introduction.workWithXML;

import com.frizer.spring.spring_introduction.workWithXML.classes.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ViewInitAndDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.say();

        context.close();

//        myDog.destroy();
//        yourDog.destroy();
    }
}
