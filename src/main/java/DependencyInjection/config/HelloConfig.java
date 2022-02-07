package DependencyInjection.config;

import DependencyInjection.services.HelloWorldFactory;
import DependencyInjection.services.HelloWorldService;
import DependencyInjection.services.HelloWorldServiceEnglishImpl;
import DependencyInjection.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

//@Configuration
public class HelloConfig {

    /*@Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }*/

    /*@Bean
    @Profile("english")
    @Primary
    public HelloWorldService helloWorldServiceEnglish(HelloWorldFactory factory){
        return factory.createGreetingServiceImpl("en");
    }*/

    /*@Bean
    @Profile("spanish")
    @Primary
    public HelloWorldService helloWorldServiceSpanish(HelloWorldFactory factory){
        return factory.createGreetingServiceImpl("es");
    }*/
    /*
    @Bean
    public HelloWorldService helloWorldServiceGerman(HelloWorldFactory factory){
        return factory.createGreetingServiceImpl("de");
    }*/

    /*@Bean(name="french")
    public HelloWorldService helloWorldServiceFrench(HelloWorldFactory factory){
        return factory.createGreetingServiceImpl("fr");
    }*/
}
