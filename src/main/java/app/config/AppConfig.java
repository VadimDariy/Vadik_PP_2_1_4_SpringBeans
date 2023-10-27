package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
}


/* В этом коде мы с помощью аннотации "@Configuration", Spring видит, что этот класс является конфигурационным, позволяя
   сканировать определённую область указанную в аннотации "@ComponentScan(basePackages = "app")", где "app" - это пакет
   в котором находятся все подпакеты с классами, которые Spring автоматически регистрирует как бины при наличии
   соответствующих анатаций таких как: @Component, @Service, @Repository, и т.д. в контейнере приложения.
   */