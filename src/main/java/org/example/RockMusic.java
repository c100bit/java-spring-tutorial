package org.example;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String[] getSong() {
        return new String[]{"cries Mary1", "cries Mary2", "cries Mary3"};
    }
}
