package com.ketan;

import javafx.util.Builder;

public class StoreItemBuilder implements Builder<StoreItem> {

    private String name;
    private Double price;
    private String shortDescription;
    private String longDescription;
    private Integer stockAvailable;
    private String packagingType;

    public StoreItemBuilder(String name, Double price) {
        this.name = name;
        this.price = price;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    public StoreItemBuilder setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    public StoreItemBuilder setLongDescription(String longDescription) {
        this.longDescription = longDescription;
        return this;
    }

    public StoreItemBuilder setStockAvailable(Integer stockAvailable) {
        this.stockAvailable = stockAvailable;
        return this;
    }

    public StoreItemBuilder setPackagingType(String packagingType) {
        this.packagingType = packagingType;
        return this;
    }

    public StoreItem build() {
        return new StoreItem(this);
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public Integer getStockAvailable() {
        return stockAvailable;
    }

    public String getPackagingType() {
        return packagingType;
    }
}
