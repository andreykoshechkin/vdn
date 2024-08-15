package com.example.vdn.view;

import com.example.vdn.oserver.GlobalStateService;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.UIScope;
import org.checkerframework.checker.guieffect.qual.UI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Представление, отображающее состояние чекбокса
@Route("gsview")
@Component
@UIScope
public class GsView extends VerticalLayout {

    private final GlobalStateService globalStateService;
    private TextField textField;

    @Autowired
    public GsView(GlobalStateService globalStateService) {
        this.globalStateService = globalStateService;
        init();
    }

    private void init() {
        // Создаем TextField и устанавливаем значение из GlobalState
        textField = new TextField();
        Boolean state = globalStateService.getBooleanState().getState();

        textField.setValue(state.toString());

        // Добавляем слушателя для обновления состояния


        add(textField);
    }
}