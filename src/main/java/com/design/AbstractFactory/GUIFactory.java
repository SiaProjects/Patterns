package com.design.AbstractFactory;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
