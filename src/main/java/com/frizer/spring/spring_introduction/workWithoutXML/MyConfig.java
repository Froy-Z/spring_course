package com.frizer.spring.spring_introduction.workWithoutXML;

import com.frizer.spring.spring_introduction.workWithoutXML.classes.Cat;
import com.frizer.spring.spring_introduction.workWithoutXML.classes.Person;
import com.frizer.spring.spring_introduction.workWithoutXML.interfaces.Pet;
import org.springframework.context.annotation.*;

@Configuration
// аннотация для инициализации класса как файла конфигурации (замена xml файла)
//@ComponentScan("com.frizer.spring.spring_introduction.workWithoutXML")
// сканирование пакета на наличие бинов и всех аннотаций @Component, Autowired и тд
@PropertySource("classpath:myApp.properties")
// аннотация указывает из какого файлв properties брать значения для полей
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
