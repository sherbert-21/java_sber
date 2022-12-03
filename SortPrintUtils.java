package sberproj;

import java.util.List;
import java.util.Objects;

public class SortPrintUtils {

    public static void printSort(List<City> sortCity, int sort) {
        if (sort == 1) {
            sortCity.sort(new CityNameComparator());
        }
        else if (sort == 2){
            sortCity.sort(new CityDistrictComparator());
        }
        else {
            sortCity.sort(new CityRegionComparator());
        }
        sortCity.forEach(System.out::println);
    }

    public static void printCityBy(List<City> sortCity, int sort){
        int i;
        int j = 0;
        if (sort == 2){
            sortCity.sort(new CityDistrictComparator());
            for (i = 0; i < sortCity.size() - 1; i++) {
                if (!Objects.equals(sortCity.get(i).getDistrict(), sortCity.get(i + 1).getDistrict())) {
                    System.out.println(sortCity.get(i).getDistrict() + " - " + (i - j));
                    j = i;
                }
            }
            System.out.println(sortCity.get(sortCity.size() - 1).getDistrict() + " - " + (sortCity.size() - j));
        }
        else if (sort == 3){
            sortCity.sort(new CityRegionComparator());
            for (i = 0; i < sortCity.size() - 1; i++) {
                if (!Objects.equals(sortCity.get(i).getRegion(), sortCity.get(i + 1).getRegion())) {
                    System.out.println(sortCity.get(i).getRegion() + " - " + (i - j));
                    j = i;
                }
            }
            System.out.println(sortCity.get(sortCity.size() - 1).getRegion() + " - " + (sortCity.size() - j));
        }
        else {
            System.out.println("Всего городов - " + sortCity.size());
        }
    }
}
