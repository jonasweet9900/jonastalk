package com.jonastalk.auth.v1.component;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "spring.security.oauth2.client.provider.keycloak")
public class KeycloakProviderProperties {
    private String issuerUri;
    private String tokenUri;
    private String authorizationUri;
}
