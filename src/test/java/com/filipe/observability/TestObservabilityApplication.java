package com.filipe.observability;

import org.springframework.boot.SpringApplication;

public class TestObservabilityApplication {

    public static void main(String[] args) {
        SpringApplication.from(ObservabilityApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
