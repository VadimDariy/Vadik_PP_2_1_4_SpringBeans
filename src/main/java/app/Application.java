package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
    }
}

/* Это главный класс в котором мы создаём с помощью объекта "applicationContext" контейнер "Spring", куда будут
   отсканированны все классы с соответствующими аннотациями при помощи настроек переданного в параметры конструктора
   конфигурационного класса "AppConfig".
   Далее на объекте "applicationContext" вызываем метод getBean(AnimalsCage.class) в который передаём как параметр объект
   типа Class содержащий в себе тип данных класса "AnimalsCage", включая метод "whatAnimalSay()" и далее сохраняем эти
   данные в переменную "bean". С этого момента переменная "bean" содержит информацию о всех данных класса "AppConfig",
   класса "AnimalCage" и всех других классов, которые помеченны аннотациями. Поэтому из этой переменной мы можем
   извлекать в консоль необходиму нам информацию, например ту, что прописанна в методе: bean.whatAnimalSay(); и с помощью
    цикла for пять объектов и выводим их в консоль.*/


