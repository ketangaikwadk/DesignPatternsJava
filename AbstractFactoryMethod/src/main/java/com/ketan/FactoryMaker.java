package com.ketan;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    public static final Map<String, Supplier<UserInterfaceFactory>> userInterfaceFactoryMap = new HashMap<>();

    static {
        userInterfaceFactoryMap.put("RED", RedUserInterfaceFactory::new);
        userInterfaceFactoryMap.put("BLUE", BlueUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String color) {
        if (userInterfaceFactoryMap.containsKey(color) && userInterfaceFactoryMap.get(color) != null) {
            return userInterfaceFactoryMap.get(color).get();
        } else {
            throw new IllegalArgumentException("Color not supported");
        }
    }
}
