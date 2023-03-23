package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {
    public ClassicalMusic() {
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
