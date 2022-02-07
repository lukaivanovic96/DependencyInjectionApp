package DependencyInjection.controllers;

import DependencyInjection.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    HelloWorldService helloWorldServiceProfile;
    HelloWorldService helloWorldServiceFrench;
    HelloWorldService helloWorldServiceGerman;

    @Autowired
    public void setHelloWorldService(HelloWorldService helloWorldServiceEnglishImpl) {
        this.helloWorldServiceProfile = helloWorldServiceEnglishImpl;
    }

    @Autowired
    @Qualifier("helloWorldServiceGerman")
    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    @Autowired
    @Qualifier("french")
    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public void greeting(){
        System.out.println(helloWorldServiceProfile.sayHello());
        System.out.println(helloWorldServiceGerman.sayHello());
        System.out.println(helloWorldServiceFrench.sayHello());
    }
}
