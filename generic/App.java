package generic;

import java.util.*;
import java.util.stream.Collectors;

public class App {

    static class A {}
    static class B extends A {}
    static class C extends B {}

    public static void main(String[] args) {

        var map = new HashMap<Integer, Integer>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        map.merge(1, 3, (a,b) -> a + b);
        map.merge(3, 3, (a,b) -> a + b);
        System.out.println(map);
    }

    public static <T> T identity(T t) {
        return t;
    }

    record Sorted(int num, String text) implements Comparable<Sorted>, Comparator<Sorted> {
        @Override
        public int compareTo(Sorted o) {
            return 0;
        }

        @Override
        public int compare(Sorted o1, Sorted o2) {
            return 0;
        }
    }

    static class Box<T> {
        private T object;

        public void set(T object) { this.object = object; }
        public T get() { return object; }
    }
}
