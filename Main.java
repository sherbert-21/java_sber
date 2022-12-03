package sberproj;

import java.util.List;

import static sberproj.CityUtils.initCities;
import static sberproj.InputUtils.input;

public class Main {

    public static void main(String[] args){
        List<City> city_list = initCities();
        int input = input(city_list);
    }
}



