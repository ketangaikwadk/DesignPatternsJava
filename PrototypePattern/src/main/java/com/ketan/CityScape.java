package com.ketan;

import java.util.ArrayList;
import java.util.List;

public class CityScape {
    public static void main(String[] args) {
        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(21, houseBuildingType);
        Building house2 = new Building(21, houseBuildingType);
        Building house3 = new Building(21, houseBuildingType);
        Building house4 = new Building(21, houseBuildingType);
        Building house5 = new Building(21, houseBuildingType);
        houseBuildingType.setType("House with yard");

        BuildingType skyScrapperBuildingType = new BuildingType("skyscrapper");
        Building skyScrapper1 = new Building(86, skyScrapperBuildingType);
        Building skyScrapper2 = new Building(86, skyScrapperBuildingType);
        Building skyScrapper3 = new Building(86, skyScrapperBuildingType);
        Building skyScrapper4 = new Building(86, skyScrapperBuildingType);
        Building skyScrapper5 = new Building(86, skyScrapperBuildingType);

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
