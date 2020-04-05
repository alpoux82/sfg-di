package guru.springframework.sfgdi.services;

public class I18nGermanGreetingServiceWithConfiguration implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGermanGreetingServiceWithConfiguration(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
