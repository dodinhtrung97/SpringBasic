package org.o7.spring.main;
 
import org.o7.spring.bean.GreetingService;
import org.o7.spring.bean.MyComponent;
import org.o7.spring.config.AppConfiguration;
import org.o7.spring.lang.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Main {
 
   public static void main(String[] args) {
  
       ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
 
       System.out.println("----------");
       Language language = (Language) context.getBean("language");
      
       System.out.println("Bean Language: "+ language);
       System.out.println("Call language.sayBye(): "+ language.getBye());
      
       System.out.println("----------");
      
       GreetingService service = (GreetingService) context.getBean("greetingService");
  

       service.sayGreeting();
  
       System.out.println("----------");
      
       MyComponent myComponent = (MyComponent) context.getBean("myComponent");
      
       myComponent.showAppInfo();
      
   }
  
}