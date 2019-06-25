/**
 * 
 */
package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Phillip Verheyden (phillipuniverse)
 */
@Configuration
public class FirstConfig {

    @Bean
    @ConditionalOnMissingBean
    public SomeInterface someBean() {
        return new FirstConfigBean();
    }

    public class FirstConfigBean implements SomeInterface {

        @Override
        public String doStuff() {
            return "first!";
        }
    }
}
