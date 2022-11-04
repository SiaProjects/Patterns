package com.design.FactoryMethod;

public class WebFactoryDialog extends FactoryDialog {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
