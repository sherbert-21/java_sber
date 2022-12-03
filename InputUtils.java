package sberproj;

import java.util.Scanner;
import java.util.List;
import static sberproj.SortPrintUtils.*;

public class InputUtils {

    public static int input(List<City> city_list) {
        Scanner in = new Scanner(System.in);
        System.out.print("Выберите команду: \n" +
                "1 - Сортировка\n" +
                "2 - Узнать кол-во городов\n" +
                "3 - Выход\n");
        int input = in.nextInt();
        if (input == 1)
            sortBy(city_list);
        else if (input == 2)
            getBy(city_list);
        in.close();
        return input;
    }

    private static void sortBy(List<City> cities){
        Scanner in = new Scanner(System.in);
        System.out.print("Как отсортировать?\n" +
                "1 - по наименованию\n" +
                "2 - по округу\n" +
                "3 - по региону\n");
        int input = in.nextInt();
        while(input > 2 || input <= 0) {
            System.out.print("Неверные входныеп данные\n" +
                    "1 - по наименованию\n" +
                    "2 - по округу\n" +
                    "3 - по региону\n");
            input = in.nextInt();
        }
        in.close();
        printSort(cities, input);
    }

    private static void getBy(List<City> cities){
        Scanner in = new Scanner(System.in);
        System.out.print("Узнать\n" +
                "1 - общее кол-во городов\n" +
                "2 - по округу\n" +
                "3 - по региону\n");
        int input = in.nextInt();
        while(input > 3 || input <= 0) {
            System.out.print("Неверные входныеп данные\n" +
                    "1 - общее кол-во городов\n" +
                    "2 - по округу\n" +
                    "3 - по региону\n");
            input = in.nextInt();
        }
        in.close();
        printCityBy(cities, input);
    }
}
