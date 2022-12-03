package sberproj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CityUtils {
    public static List<City> initCities(){
        List<City> cities = new ArrayList<>();
        int i = 0;
        try {
            Scanner scanner = new Scanner(new File("/Users/admin/Desktop/city_ru.csv"));
            while (scanner.hasNextLine()) {
                cities.add(parse(scanner.nextLine()));
                i++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return cities;
    }

    private static City parse(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(";");
        int index = scanner.nextInt();
        String name = scanner.next();
        String region = scanner.next();
        String district = scanner.next();
        int population = scanner.nextInt();
        String foundation = null;
        if (scanner.hasNext()){
            foundation = scanner.next();
        }
        scanner.close();
        return new City(index, name, region, district, population, foundation);
    }
}
