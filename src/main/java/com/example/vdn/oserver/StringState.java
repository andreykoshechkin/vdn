package com.example.vdn.oserver;

// Реализация состояния для типа String

public class StringState implements State<String> {
    private String value;

    public StringState(String value) {
        this.value = value;
    }

    @Override
    public String getState() {
        return value;
    }

    @Override
    public void setState(String state) {
        this.value = state;
    }
}