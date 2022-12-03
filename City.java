package sberproj;

import java.util.Comparator;

public class City {

    private int index;
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;


    public City(int index, String name, String region, String district, int population, String foundation) {
        this.index = index;
        this.name = name;
        this.foundation = foundation;
        this.region = region;
        this.district = district;
        this.population = population;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }

    @Override

    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }

    public static int compare(City i, City j, int sort) {
        if(sort == 1) {
            int f = i.name.compareTo(j.name);
            return (f != 0) ? f : i.name.compareTo(j.name);
        }
        int f = i.district.compareTo(j.district);
        return (f != 0) ? f : i.district.compareTo(j.district);
    }
}

class CityNameComparator implements Comparator<City> {
    @Override
    public int compare(City s, City t) {
        return s.getName().compareTo(t.getName());
    }
}

class CityDistrictComparator implements Comparator<City> {
    @Override
    public int compare(City s, City t) {
        int f = s.getDistrict().compareTo(t.getDistrict());
        return (f != 0) ? f : s.getName().compareTo(t.getName());
    }
}
class CityRegionComparator implements Comparator<City> {
    @Override
    public int compare(City s, City t) {
        int f = s.getRegion().compareTo(t.getRegion());
        return (f != 0) ? f : s.getName().compareTo(t.getName());
    }
}

