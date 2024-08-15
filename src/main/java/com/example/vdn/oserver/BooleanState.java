package com.example.vdn.oserver;

import org.springframework.stereotype.Component;

public class BooleanState implements State<Boolean> {
    private Boolean value;

    public BooleanState(Boolean value) {
        this.value = value;
    }

    @Override
    public Boolean getState() {
        return value;
    }

    @Override
    public void setState(Boolean state) {
        this.value = state;
    }
}