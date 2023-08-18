package com.frizer.spring.spring_introduction.workWithXML.classes;

import com.frizer.spring.spring_introduction.workWithXML.interfaces.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    //    @Autowired
    //    @Qualifier("CatBean") // аннотация для field, если бинов создаётся больше, чем 1
    private Pet pet;
    @Value("${person.surname}") // вариант присвоения значений с помощью файла properties
    private String surname;
    @Value("${person.age}")
    private int age;

//    public Person(){
//        System.out.println("Person bean is created");
//    }

    @Autowired // после внедрения аннотации к конструктору, конструктор по умолчанию не требуется
    public Person(@Qualifier("CatBean") Pet pet) { // синтаксис аннотации в конструкторе
        System.out.println("Person bean is created"); // комментарий для наглядности
        this.pet = pet;
    }

    //    @Autowired // также возможно внедрение аннотации для сеттера
    //    @Qualifier("CatBean") // синтаксис зависимости для сеттера
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("Class Person: get surname");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Class Person: get age");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
