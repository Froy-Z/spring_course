package com.frizer.spring.spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;
    public Person(){
    }

    public Person(Pet pet) {
        System.out.println("Person bean is created"); // комментарий для наглядности
        this.pet = pet;
    }

    public String getSurname() {
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

    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
