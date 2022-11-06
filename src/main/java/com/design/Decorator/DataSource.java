package com.design.Decorator;

// Общий интерфейс компонентов.

public interface DataSource {

    void writeData(String data);
    String readData();
}
