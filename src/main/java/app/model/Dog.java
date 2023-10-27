package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    @Override
    public String toString(){
        return "Im a Dog";
    }

}

/* Класс "Dog" помечен аннотацией @Component, поэтому Spring будет интерпритировать этот класс как компонент, а так
   же автоматически будет создавать объекты этого класса и управлять ими в рамках контейнера приложения Spring.
   Далее Мы видим что класс Dog наследуется от класса Animal.  Внутри класса Dog переопределён метод toString() из
   корневого класса object, который возвращает строку "Im a Dog", что будет использовано для представления объектов
   класса "Dog" в виде строки. Метод toString() будет использоваться, в методе whatAnimalSay() класса "AnimalsCage" для
   вывода информации о том, что "говорит" собака.*/