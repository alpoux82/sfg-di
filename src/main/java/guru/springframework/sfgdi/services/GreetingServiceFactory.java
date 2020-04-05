package guru.springframework.sfgdi.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {
        switch (lang) {
            case "es":
                return new I18nSpanishGreetingServiceWithRepository(greetingRepository);
            case "de":
                return new I18nGermanGreetingServiceWithRepository(greetingRepository);
            case "en":
            default:
                return new I18nEnglishGreetingServiceWithRepository(greetingRepository);
        }
    }
}
