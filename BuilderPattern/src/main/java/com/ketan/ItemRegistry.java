package com.ketan;

public class ItemRegistry {
    public static void main(String[] args) {
        StoreItem item1 = new StoreItemBuilder("Pen", 10.0)
                .setShortDescription("black color")
                .setStockAvailable(10)
                .build();

        addToItemRegistry(item1);
    }

    public static void addToItemRegistry(StoreItem storeItem) {
        System.out.println("Item added to registry -> " + storeItem);
    }
}
