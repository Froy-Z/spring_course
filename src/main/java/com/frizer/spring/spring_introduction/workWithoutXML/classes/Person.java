package com.frizer.spring.spring_introduction.workWithoutXML.classes;

import com.frizer.spring.spring_introduction.workWithoutXML.interfaces.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(/*@Qualifier("dogBean")*/ Pet pet) { // синтаксис аннотации в конструкторе
        System.out.println("Person bean is created"); // комментарий для наглядности
        this.pet = pet;
    }

    public void setPet(Pet pet) {
//        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
//        System.out.println("Class Person: get surname");
        return surname;
    }

    public void setSurname(String surname) {
//        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
//        System.out.println("Class Person: get age");
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
//        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
