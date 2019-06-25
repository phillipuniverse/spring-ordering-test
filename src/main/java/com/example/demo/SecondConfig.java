/**
 * 
 */
package com.example.demo;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Phillip Verheyden (phillipuniverse)
 */
@Configuration
@AutoConfigureBefore(FirstConfig.class)
public class SecondConfig {

    @Bean
    @ConditionalOnMissingBean
    public SomeInterface someBean() {
        return new SecondConfigBean();
    }

    public class SecondConfigBean implements SomeInterface {

        @Override
        public String doStuff() {
            return "second!";
        }
    }
}
