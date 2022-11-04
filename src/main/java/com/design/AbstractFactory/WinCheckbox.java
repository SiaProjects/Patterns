package com.design.AbstractFactory;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под Windows.
 */

public class WinCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WinCkeckbox!");
    }
}
