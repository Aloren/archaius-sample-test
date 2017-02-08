package org.sample;

import com.netflix.config.DynamicPropertyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleContext {

    @Bean
    public SampleConfiguration sampleConfiguration() {
        return new SampleConfiguration();
    }

    @Bean
    public String property2() {
        return DynamicPropertyFactory
                .getInstance()
                .getStringProperty("my.super.property2", "default").get();
    }
}
