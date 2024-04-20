package com.ketan;

public abstract class Graphic {

    private int heightInPixels;

    public Graphic(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    public int getHeightInPixels() {
        return heightInPixels;
    }

    public void setHeightInPixels(int heightInPixels) {
        this.heightInPixels = heightInPixels;
    }

    @Override
    public String toString() {
        return "Graphic{" +
                "heightInPixels=" + heightInPixels +
                '}';
    }

    public abstract Graphic clone();
}
