package com.mx.ids.articulos.configuration;


import com.mx.ids.articulos.domain.files.FileClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFile {
    @Bean
    FileClass getFileClass(){
        return new FileClass();

    }
}
