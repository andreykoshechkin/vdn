package com.example.vdn.oserver;

import org.springframework.stereotype.Service;

@Service
public class GlobalStateService {
    private State<Boolean> booleanState;

    public GlobalStateService() {
        // Инициализируйте состояние по умолчанию, если необходимо
        this.booleanState = new BooleanState(false);
    }

    public State<Boolean> getBooleanState() {
        return booleanState;
    }

    public void setBooleanState(State<Boolean> state) {
        this.booleanState = state;
    }
}