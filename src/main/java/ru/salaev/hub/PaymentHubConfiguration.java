package ru.salaev.hub;

import io.github.resilience4j.common.retry.configuration.RetryConfigCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class PaymentHubConfiguration {

    @Bean
    public RetryConfigCustomizer testCustomizer() {
        return RetryConfigCustomizer
                .of("throwingException", builder -> builder.waitDuration(Duration.ofSeconds(1)));
    }

}
