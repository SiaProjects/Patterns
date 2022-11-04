package com.design.FactoryMethod;

public class WinButton implements Button{
    @Override
    public void render() {
        System.out.println("Отрисовка кнопки в стиле WINDOWS...");
    }

    @Override
    public void onClick() {
        System.out.println("Началась работа обработчика событий WINDOWS...");
    }
}
