package com.design.FactoryMethod;

public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("Возвращаю HTML-код кнопки...");
    }

    @Override
    public void onClick() {
        System.out.println("Началась работа обработчика событий браузера...");
    }
}
