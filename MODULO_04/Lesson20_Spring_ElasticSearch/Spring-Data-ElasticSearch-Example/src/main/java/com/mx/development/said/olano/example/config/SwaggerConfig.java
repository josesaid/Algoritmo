package com.mx.development.said.olano.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * Configuration class for setting up Swagger/OpenAPI documentation.
 *
 * This configuration defines an OpenAPI bean that provides metadata for the API,
 * including title, description, version, contact information, and license details.
 *
 * @author josesaidolanogarcia
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("Spring Data Elasticsearch example")
            .description("Spring Data Elasticsearch example with Testcontainers")
            .version("v0.0.2")
            .contact(getContactDetails())
            .license(getLicenseDetails()));
    }

    private Contact getContactDetails() {
        return new Contact().name("Said Olano")
            .email("josesaid@gmail.com");
    }

    private License getLicenseDetails() {
        return new License().name("GNU General Public License v3.0");
    }

}