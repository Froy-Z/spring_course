package com.frizer.spring.spring_introduction.Tests;

import com.frizer.spring.spring_introduction.Dog;
import com.frizer.spring.spring_introduction.Pet;

public class StandartInit {
    public static void main(String[] args) {
        // стандартное объявление экземпляра класса
        Pet pet = new Dog();
        pet.say();
    }
}
