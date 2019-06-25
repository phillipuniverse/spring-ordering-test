/**
 * 
 */
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author Phillip Verheyden (phillipuniverse)
 */
@SpringBootTest
public class OrderingTest {

    @EnableAutoConfiguration
    @Configuration
    static class Config {}

    @Autowired
    ApplicationContext appctx;

    @Test
    public void testOrdering() {
        // if there were multiple definitions, this would throw NoUniqueBeanDefinitionException
        SomeInterface injected = appctx.getBean(SomeInterface.class);
        assertEquals("second!", injected.doStuff());
    }
}
