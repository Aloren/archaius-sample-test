package org.sample;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

public class SampleConfiguration {

    DynamicStringProperty property = DynamicPropertyFactory
            .getInstance()
            .getStringProperty("my.super.property", "default");


    public String getProperty() {
        return property.getValue();
    }

}
