package com.ketan;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VendingMachine {

    public static final Map<String, Supplier<Snack>> snackTypes = new HashMap<String, Supplier<Snack>>();

    static {
        snackTypes.put("ChocolateBar", ChocolateBar::new);
        snackTypes.put("Chips", Chips::new);
        snackTypes.put("Drink", Drink::new);
    }

    //This is factory method
    Snack getSnack(String snackType) {
        if (snackTypes.containsKey(snackType) && snackTypes.get(snackType) != null) {
            return snackTypes.get(snackType).get();
        } else {
            throw new IllegalArgumentException(snackType + " is not valid");
        }
    }
}
