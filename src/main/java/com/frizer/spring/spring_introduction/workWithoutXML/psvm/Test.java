package com.frizer.spring.spring_introduction.workWithoutXML.psvm;

import com.frizer.spring.spring_introduction.workWithoutXML.MyConfig;
import com.frizer.spring.spring_introduction.workWithoutXML.classes.Cat;
import com.frizer.spring.spring_introduction.workWithoutXML.classes.Person;
import com.frizer.spring.spring_introduction.workWithoutXML.interfaces.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        cat1.say();

        Person person = context.getBean("personBean", Person.class);

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
