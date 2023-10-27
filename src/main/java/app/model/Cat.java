package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    @Override
    public String toString() {
        return "Im a Cat";
    }
}

/* Класс "Cat" помечен аннотацией @Component, поэтому Spring будет интерпритировать этот класс как компонент, а так
   же автоматически будет создавать объекты этого класса и управлять ими в рамках контейнера приложения Spring.
   Далее Мы видим что класс Dog наследуется от класса Animal.  Внутри класса Dog переопределён метод toString() из
   корневого класса object, который возвращает строку "Im a Cat", что будет использовано для представления объектов
   класса "Cat" в виде строки. Метод toString() будет использоваться, в методе whatAnimalSay() класса "AnimalsCage" для
   вывода информации о том, что "говорит" кошка.*/