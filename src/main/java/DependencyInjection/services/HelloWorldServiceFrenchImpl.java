package DependencyInjection.services;

public class HelloWorldServiceFrenchImpl implements HelloWorldService{
    @Override
    public String sayHello() {
        return "Bonjour le monde!!";
    }
}
