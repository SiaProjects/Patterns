package com.design.AbstractFactory;

public class Main {

    private static Application configureApplication() {
        Application application;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WinFactory();
        }

        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {

        Application app = configureApplication();
        app.paint();
    }
}
