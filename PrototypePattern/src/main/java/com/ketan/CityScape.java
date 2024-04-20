package com.ketan;

import java.util.ArrayList;
import java.util.List;

public class CityScape {
    public static void main(String[] args) {
        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(21, houseBuildingType);
        Building house2 = house1.clone();
        Building house3 = house1.clone();
        Building house4 = house1.clone();
        Building house5 = house1.clone();
        houseBuildingType.setType("House with yard");

        BuildingType skyScrapperBuildingType = new BuildingType("skyscrapper");
        Building skyScrapper1 = new Building(86, skyScrapperBuildingType);
        Building skyScrapper2 = skyScrapper1.clone();
        Building skyScrapper3 = skyScrapper1.clone();
        Building skyScrapper4 = skyScrapper1.clone();
        Building skyScrapper5 = skyScrapper1.clone();

        List<Graphic> order = new ArrayList<Graphic>();
        order.add(house1);
        order.add(house2);
        order.add(house3);
        order.add(house4);
        order.add(house5);
        order.add(skyScrapper1);
        order.add(skyScrapper2);
        order.add(skyScrapper3);
        order.add(skyScrapper4);
        order.add(skyScrapper5);

        createCityScape(order);
    }

    private static void createCityScape(List<Graphic> order) {
        System.out.println("Constructing CityScape");
        order.forEach(System.out::println);
    }
}
