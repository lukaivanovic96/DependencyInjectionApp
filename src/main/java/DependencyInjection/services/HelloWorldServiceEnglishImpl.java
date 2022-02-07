package DependencyInjection.services;


public class HelloWorldServiceEnglishImpl implements HelloWorldService{
    @Override
    public String sayHello() {
        return "Hello World!!";
    }
}
