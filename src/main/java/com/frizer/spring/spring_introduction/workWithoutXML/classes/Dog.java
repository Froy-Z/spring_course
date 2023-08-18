package com.frizer.spring.spring_introduction.workWithoutXML.classes;

import com.frizer.spring.spring_introduction.workWithoutXML.interfaces.Pet;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component("dogBean")
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

//    @PostConstruct // установка аннотации для авто вызова метода init
    public void init() {
        System.out.println("Class Dog: init method");
    }

//    @PreDestroy // тоже самое и для destroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }

}
