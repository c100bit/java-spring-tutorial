package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class ClassicalMusic implements Music {
    private ClassicalMusic() {
    }

    @PostConstruct
    public void doInit() {
        System.out.println("do Init");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("do Destroy");
    }

    @Override
    public String[] getSong() {
        return new String[]{"Rhapsody1", "Rhapsody2", "Rhapsody3"};
    }
}
