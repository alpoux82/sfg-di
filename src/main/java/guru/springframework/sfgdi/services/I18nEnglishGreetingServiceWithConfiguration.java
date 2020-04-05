package guru.springframework.sfgdi.services;

public class I18nEnglishGreetingServiceWithConfiguration implements GreetingService{

    private GreetingRepository greetingRepository;

    public I18nEnglishGreetingServiceWithConfiguration(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
