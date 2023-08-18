package com.frizer.spring.spring_introduction.workWithXML;

import com.frizer.spring.spring_introduction.workWithXML.classes.Dog;
import com.frizer.spring.spring_introduction.workWithXML.interfaces.Pet;

public class StandartInit {
    public static void main(String[] args) {
        // стандартное объявление экземпляра класса
        Pet pet = new Dog();
        pet.say();
    }
}
