package org.o7.spring.config;
 
import org.o7.spring.lang.Language;
import org.o7.spring.lang.impl.English;
import org.o7.spring.lang.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
@Configuration
@ComponentScan({"org.o7.spring.bean"})
public class AppConfiguration {
 
    @Bean(name ="language")
    public Language getLanguage() {
 
        return new English();
    }
      
}