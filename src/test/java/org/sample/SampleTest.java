package org.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {SampleTest.TestConfiguration.class, SampleContext.class})
@RunWith(SpringRunner.class)
public class SampleTest {

    @Autowired
    private SampleConfiguration sampleConfiguration;
    @Autowired
    private String property2;

    @Test
    public void shouldFetchConfiguration() throws Exception {
        assertThat(sampleConfiguration).isNotNull();
        assertThat(sampleConfiguration.getProperty()).isNotNull().isNotEmpty().isEqualTo("My super value!");
    }

    @Test
    public void shouldFetchOtherConfiguration() throws Exception {
        assertThat(property2).isEqualTo("Property2");

    }

    @EnableAutoConfiguration
    @Configuration
    static class TestConfiguration {

    }
}