package kea.alog.issue.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class Swagger3Config {

    @Value("${springdoc.version}")
    private String springdocVersion;

    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                .title("Issue API")
                .version(springdocVersion)
                .description("API for user domain");

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }}