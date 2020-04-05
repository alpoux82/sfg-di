package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "primary greeting service";
    }

    @Override
    public String getSpanishGreeting() {
        return "servicio de saludo primario";
    }

    @Override
    public String getGermanGreeting() {
        return "primärer grußdienst";
    }
}
