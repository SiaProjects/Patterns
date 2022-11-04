package com.design.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WebFactoryDialog webFactoryDialog = new WebFactoryDialog();
        HTMLFactoryDialog htmlFactoryDialog = new HTMLFactoryDialog();

        List<Button> buttons = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            buttons.add(webFactoryDialog.createButton());
            buttons.add(htmlFactoryDialog.createButton());
        }

        buttons.forEach(item -> item.onClick());
        buttons.forEach(item -> item.render());
    }
}
