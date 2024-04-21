package com.ketan;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserInterface roadUserInterface = createUserInterface("RED");
        UserInterface mountainUserInterface = createUserInterface("BLUE");

        System.out.println(roadUserInterface);
        System.out.println(mountainUserInterface);
    }

    private static UserInterface createUserInterface(String color) {
        UserInterfaceFactory userInterfaceFactory = FactoryMaker.createFactory(color);
        Button button = userInterfaceFactory.createButton();
        Scrollbar scrollbar = userInterfaceFactory.createScrollbar();

        return new UserInterface(button, scrollbar);
    }
}
