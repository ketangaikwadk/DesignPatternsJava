package com.ketan;

public class RedUserInterfaceFactory implements UserInterfaceFactory {
    public Button createButton() {
        return new RedButton();
    }

    public Scrollbar createScrollbar() {
        return new RedScrollbar();
    }
}
