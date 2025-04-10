package lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class App {

    public static void main(String args[]) {

        Country c1 = new Country("Hungary", "Budapest", Country.Continent.EUROPE);
        Country c2 = new Country("Norway", "Oslo", Country.Continent.EUROPE);
        Country c3 = new Country("Sweden", "Stockholm", Country.Continent.EUROPE);
        Country c4 = new Country("Brazil", "Brasilia", Country.Continent.SOUTH_AMERICA);
        Country c5 = new Country("Morocco", "Rabat", Country.Continent.AFRICA);

        Country m1 = new Country("Egypt", "Cairo", Country.Continent.AFRICA);
        Country m2 = new Country("Canada", "Ottawa", Country.Continent.NORTH_AMERICA);
        Country m3 = new Country("Argentina", "Buenos Aires", Country.Continent.SOUTH_AMERICA);

        Country mm1 = new Country("Bogota", "Colombia", Country.Continent.SOUTH_AMERICA);
        Country mm2 = new Country("Tbilisi", "Georgia", Country.Continent.EUROPE);

        Map<String, Country> mapWithCountries = new HashMap<>();
        mapWithCountries.put("Bratislava", new Country("Slovakia", "Bratislava", Country.Continent.EUROPE));
        mapWithCountries.put("Prague", new Country("Czech", "Prague", Country.Continent.EUROPE));
        mapWithCountries.put("Minsk", new Country("Belarus", "Minsk", Country.Continent.EUROPE));
        mapWithCountries.put("Vien", new Country("Austria", "Vien", Country.Continent.EUROPE));
        mapWithCountries.put("Bern", new Country("Swiss", "Bern", Country.Continent.EUROPE));
        mapWithCountries.put("Algiers", new Country("Algeria", "Algiers", Country.Continent.AFRICA));

        List<Country> countries = mapWithCountries.values().stream().collect(Collectors.toList());

        Comparator<Country> countryComparator = (o1, o2) -> {
            if (o1.continent.name().equals(o2.continent.name())) {
                return o1.capitalCity.compareTo(o2.capitalCity);
            }
            return o1.continent.name().compareTo(o2.continent.name());
        };

        Collections.binarySearch(countries, c1);
        countries.forEach(System.out::println);
        System.out.println("--");
        Collections.binarySearch(countries, c2);
        countries.forEach(System.out::println);
        System.out.println("--");
        Collections.sort(countries);
        System.out.println(Collections.binarySearch(countries, new Country("Slovakia", "Bratislava", Country.Continent.EUROPE)));
        countries.forEach(System.out::println);

        List<King> kings = new ArrayList<>();
        kings.add(new King("Władysław III Warneńczyk"));

    }

    static void printQueue(Queue<Country> queue) {
        queue.forEach(s -> System.out.println("-- STORE: " + s));
    }

    static void executeAndPrint(Country queue) {
        System.out.println(queue);
    }

    static record King(String name) {}

    static class Country implements Comparable<Country> {
        String name;
        String capitalCity;
        Continent continent;

        public Country(String name, String capitalCity, Continent continent) {
            this.name = name;
            this.capitalCity = capitalCity;
            this.continent = continent;
        }

        @Override
        public int compareTo(Country o) {
            return capitalCity.length() - o.capitalCity.length();
        }

        enum Continent {
            EUROPE,
            SOUTH_AMERICA,
            NORTH_AMERICA,
            ASIA,
            AUSTRALIA,
            AFRICA
        }

        @Override
        public String toString() {
            return "Country{" +
                    "name='" + name + '\'' +
                    ", capitalCity='" + capitalCity + '\'' +
                    ", continent=" + continent +
                    '}';
        }
    }
}


