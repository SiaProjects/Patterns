package com.design.AbstractFactory;

/**
 * Все семейства продуктов имеют одни и те же вариации (MacOS/Windows).
 *
 * Это вариант кнопки под Windows.
 */

public class WInButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton!");
    }
}
