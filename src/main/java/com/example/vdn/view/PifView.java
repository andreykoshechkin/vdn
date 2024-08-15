package com.example.vdn.view;

import com.example.vdn.oserver.BooleanState;
import com.example.vdn.oserver.GlobalStateService;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Представление с чекбоксом
@Route("pifview")
@Component
@UIScope
public class PifView extends VerticalLayout {

    private final GlobalStateService globalStateService;
    private Checkbox checkbox;

    @Autowired
    public PifView(GlobalStateService globalStateService) {
        this.globalStateService = globalStateService;
        init();
    }

    private void init() {
        // Создаем Checkbox и устанавливаем состояние из GlobalStateService
        checkbox = new Checkbox("My CheckBox");
        Boolean currentState = globalStateService.getBooleanState().getState();
        checkbox.setValue(currentState != null ? currentState : false);

        // Добавляем слушателя для обновления состояния
        checkbox.addValueChangeListener(event -> {
            globalStateService.setBooleanState(new BooleanState(event.getValue()));
        });

        add(checkbox);
    }
}