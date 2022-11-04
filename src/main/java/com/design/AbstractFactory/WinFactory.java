package com.design.AbstractFactory;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WInButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
