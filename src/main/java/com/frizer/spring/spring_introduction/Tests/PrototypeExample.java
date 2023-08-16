package com.frizer.spring.spring_introduction.Tests;

import com.frizer.spring.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeExample {
    public static void main(String[] args) {
        // Создание контекста на основе XML-конфигурации
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        // Пример работы bean scope с областью видимости prototype (один экземпляр для одного)
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka"); // Устанавливаем имя Belka

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka"); // Т.к. ссылки на экземпляры разные, то и имена будут отличаться

        // Проверка на равенство ссылок и содержимого переменных
        System.out.println("Переменные myDog и yourDog принадлежат одному экземпляру бина класса? " +
                (myDog == yourDog));
        System.out.println("Содержимое переменных myDog и yourDog совпадает? " +
                (myDog.equals(yourDog)) +
                "\nПеременная myDog с именем: " + myDog.getName() + " и yourDog: " + yourDog.getName());

        // закрытие контекста
        context.close();
    }
}
