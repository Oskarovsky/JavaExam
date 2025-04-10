package streams;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.*;

public class AppStream {

    public static void main(String[] args) {

        IntStream.range(1, 6)
                .mapToObj(i -> i)
                .forEach(System.out::println);
    }

    private static List<String> sort(List<String> list) {
        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }

    public static List<Country> getCountryList() {
        return Arrays.asList(
                new Country("Poland", "Warsaw", "PLN", Continent.EUROPE, 38386000, 312696),
                new Country("Germany", "Berlin", "EUR", Continent.EUROPE, 83240000, 357022),
                new Country("France", "Paris", "EUR", Continent.EUROPE, 67390000, 551695),
                new Country("Italy", "Rome", "EUR", Continent.EUROPE, 59260000, 301340),
                new Country("Spain", "Madrid", "EUR", Continent.EUROPE, 47350000, 505992),
                new Country("United Kingdom", "London", "GBP", Continent.EUROPE, 67080000, 243610),
                new Country("United States", "Washington D.C.", "USD", Continent.NORTH_AMERICA, 331900000, 9833517),
                new Country("Canada", "Ottawa", "CAD", Continent.NORTH_AMERICA, 38390000, 9984670),
                new Country("Australia", "Canberra", "AUD", Continent.AUSTRALIA, 25690000, 7692024),
                new Country("Japan", "Tokyo", "JPY", Continent.ASIA, 125800000, 377975),
                new Country("Brazil", "Brasília", "BRL", Continent.SOUTH_AMERICA, 213300000, 8515767),
                new Country("Russia", "Moscow", "RUB", Continent.EUROPE, 146000000, 17098242),
                new Country("China", "Beijing", "CNY", Continent.ASIA, 1412000000, 9596961),
                new Country("India", "New Delhi", "INR", Continent.ASIA, 1393409038, 3287263),
                new Country("South Africa", "Pretoria", "ZAR", Continent.AFRICA, 59308690, 1219090)
        );
    }

    record Country(String name, String capital, String currencyIndex, Continent continent, long population, int area) {
    }

    enum Continent {
        EUROPE, AFRICA, SOUTH_AMERICA, NORTH_AMERICA, AUSTRALIA, ASIA
    }
}
