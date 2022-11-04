package com.design.FactoryMethod;

public class HTMLFactoryDialog extends FactoryDialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
