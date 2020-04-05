package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class I18nEnglishGreetingServiceWithRepository implements GreetingService {

    private GreetingRepository greetingRepository;

    public I18nEnglishGreetingServiceWithRepository(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }
}
