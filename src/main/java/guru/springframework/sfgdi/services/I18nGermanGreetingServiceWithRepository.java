package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class I18nGermanGreetingServiceWithRepository implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nGermanGreetingServiceWithRepository(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
