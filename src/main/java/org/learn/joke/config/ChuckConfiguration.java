package org.learn.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChuckConfiguration {
    @Bean
    ChuckNorrisQuotes chuckNorrisQuotes(){
        return  new ChuckNorrisQuotes();
    }
}
