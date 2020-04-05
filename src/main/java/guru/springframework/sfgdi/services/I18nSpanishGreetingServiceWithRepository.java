package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class I18nSpanishGreetingServiceWithRepository implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nSpanishGreetingServiceWithRepository(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getSpanishGreeting();
    }
}
