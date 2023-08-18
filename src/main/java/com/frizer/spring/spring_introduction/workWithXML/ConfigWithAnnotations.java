package com.frizer.spring.spring_introduction.workWithXML;

import com.frizer.spring.spring_introduction.workWithXML.classes.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext4.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

//        Cat myCat = context.getBean("CatBean", Cat.class); // id "cat" в случае, если не был явно прописан id
//        myCat.say();

        System.out.println(person.getSurname() + "\n" + person.getAge());

        context.close();
    }
}
