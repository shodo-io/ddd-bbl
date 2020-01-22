package io.shodo.ddd.bbl.words.infrastructure.config;

import io.shodo.ddd.bbl.words.domain.services.WordService;
import io.shodo.ddd.bbl.words.domain.services.WordServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansInjection {

    @Bean
    public WordService injectWordService() {
        return new WordServiceImpl();
    }
}
