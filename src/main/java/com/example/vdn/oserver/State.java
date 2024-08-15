package com.example.vdn.oserver;

// Интерфейс состояния
public interface State<T> {
    T getState();
    void setState(T state);
}