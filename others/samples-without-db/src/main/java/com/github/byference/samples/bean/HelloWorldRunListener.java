package com.github.byference.samples.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * HelloWorldRunListener
 *
 * @author byference
 * @since 2019-08-28
 */
public class HelloWorldRunListener implements SpringApplicationRunListener {


    public HelloWorldRunListener(SpringApplication application, String[] args) {

    }


    @Override
    public void starting() {

        System.err.println("HelloWorldRunListener starting...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
