package com.ketan;

public class BlueUserInterfaceFactory implements UserInterfaceFactory {
    public Button createButton() {
        return new BlueButton();
    }

    public Scrollbar createScrollbar() {
        return new BlueScrollbar();
    }
}
