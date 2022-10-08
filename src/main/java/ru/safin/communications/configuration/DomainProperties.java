package ru.safin.communications.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@ConfigurationProperties("application.domain")
public class DomainProperties {

    private String players;
}
