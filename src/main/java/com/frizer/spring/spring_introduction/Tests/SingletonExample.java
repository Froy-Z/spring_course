package com.frizer.spring.spring_introduction.Tests;

import com.frizer.spring.spring_introduction.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonExample {
    public static void main(String[] args) {
        // Создание контекста на основе XML-конфигурации
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        // пример работы bean scope с областью видимости singleton (один экземпляр для всех)
        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka"); // присвается имя Belka

        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka"); // Т.к. ссылки совпадают, переписывается переменная на новое имя Strelka

        // Проверка на равенство ссылок и содержимого переменных
        System.out.println("Переменные myDog и yourDog принадлежат одному экземпляру бин класса? " +
                (myDog == yourDog));
        System.out.println("Содержимое переменных myDog и yourDog совпадает? " +
                (myDog.equals(yourDog)) +
                "\nПеременная myDog с именем: " + myDog.getName() + " и yourDog: " + yourDog.getName());

        // закрытие контекста
        context.close();
    }
}
