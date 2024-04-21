package com.ketan;

public class VendingMachine {

    //This is factory method
    Snack getSnack(String snackType){
        if (snackType.equals("ChocolateBar")){
            return new ChocolateBar();
        }else if (snackType.equals("Chips")){
            return new Chips();
        }else if (snackType.equals("Drink")){
            return new Drink();
        }else {
            throw new IllegalArgumentException(snackType+" is not valid");
        }
    }
}
