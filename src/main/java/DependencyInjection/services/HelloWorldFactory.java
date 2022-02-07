package DependencyInjection.services;

public class HelloWorldFactory {

    public HelloWorldService createGreetingServiceImpl(String language){
        HelloWorldService service = null;

        switch (language) {
            case "en":
                service = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                service = new HelloWorldServiceSpanishImpl();
                break;
            case "de":
                service = new HelloWorldServiceGermanImpl();
                break;
            case "fr":
                service = new HelloWorldServiceFrenchImpl();
                break;
        }
        return service;

    }

}
