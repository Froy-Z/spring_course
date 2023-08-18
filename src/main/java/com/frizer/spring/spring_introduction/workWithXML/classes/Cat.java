package com.frizer.spring.spring_introduction.workWithXML.classes;

import com.frizer.spring.spring_introduction.workWithXML.interfaces.Pet;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("CatBean")
// создания бина с помощью аннотации, в скобках указывается id для будущего бина, по умолчанию если id не указан
// инициализация id будет равна названию класса Cat, но прописными буквами cat
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Cat: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Cat: destroy method");
    }
}
