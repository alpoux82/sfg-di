package guru.springframework.sfgdi.services;

public class I18nSpanishGreetingServiceWithConfiguration implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nSpanishGreetingServiceWithConfiguration(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
