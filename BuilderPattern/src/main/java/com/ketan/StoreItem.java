package com.ketan;

public class StoreItem {

    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    public StoreItem(StoreItemBuilder storeItemBuilder) {
        this.name = storeItemBuilder.getName();
        this.price = storeItemBuilder.getPrice();
        this.shortDescription = storeItemBuilder.getShortDescription();
        this.longDescription = storeItemBuilder.getLongDescription();
        this.stockAvailable = storeItemBuilder.getStockAvailable();
        this.packagingType = storeItemBuilder.getPackagingType();
    }


    @Override
    public String toString() {
        return "StoreItem{" + "name='" + name + '\'' + ", price=" + price + ", shortDescription='" + shortDescription + '\'' + ", longDescription='" + longDescription + '\'' + ", stockAvailable=" + stockAvailable + ", packagingType='" + packagingType + '\'' + '}';
    }
}
