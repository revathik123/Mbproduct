package com.mbproduct.securityConfiguration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.mbproduct.repository")
@EntityScan(basePackages = "com.mbproduct.Entity")
public class SecurityConfiguration {

}
