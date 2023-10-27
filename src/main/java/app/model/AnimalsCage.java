package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;
    @Autowired
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
}

/*  Класс "AnimalsCage" помечен аннотацией @Component, поэтому Spring будет интерпритировать этот класс как компонент, а
    так же автоматически будет создавать объекты этого класса и управлять ими в рамках контейнера приложения Spring.
    Dнутри класса есть два поля. Первое "animal" помеченно аннотациями @Autowired и @Qualifer("dog"), это означает, что
    Spring внедрит зависимость животного, а конкретно собаку "Dog" в поле "animal". Второе поле "timer",
    тоже имеет аннотацию @Autowired, но без @Qualifer, потому как в данном проекте один класс представляющий тип данных
    "Timer", поэтому Spring его найдет без труда. Это говорит о том, что Spring автоматически будет искать бин типа
    "Timer" и внедрит его в поле "timer". А далее соответственно метод "whatAnimalSay" отработает и вернёт результат на
     основе внедренных данных зависимости.
     */