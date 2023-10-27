package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer {

    private Long nanoTime = System.nanoTime();

    public Long getTime() {
        return nanoTime;
    }
}

/*  Класс "Timer" помечен аннотацией @Component, поэтому Spring будет интерпритировать этот класс как компонент, а так
    же автоматически будет создавать объекты этого класса и управлять ими в рамках контейнера приложения Spring.
    Внутри класса есть переменная "nanoTime", которая в контексте этого приложения будет инициализироваться моментом
    текущего системного времени запуска метода "getTime()", которое будет фиксироваться методом "nanoTime" из
    статического класса "System", значение которого будет возвращено в вызывающий метод "whatAnimalSay()" класса
    "AnimalsCage"*/