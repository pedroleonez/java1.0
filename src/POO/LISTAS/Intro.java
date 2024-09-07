package POO.LISTAS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Intro {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Pedro");
        list.add("Jose");
        list.add("Joao");
        list.add(2, "Marco");

        System.out.println(list.size());

        for (String l : list) {
            System.out.println(l);
        }

        System.out.println("------------------------");

        list.removeIf(x -> x.charAt(0) == 'J');

        for (String l : list) {
            System.out.println(l);
        }

        System.out.println("------------------------");

        System.out.println("Index of Pedro = " + list.indexOf("Pedro"));

        System.out.println("------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').toList();

        for (String l : result) {
            System.out.println(l);
        }

        System.out.println("------------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
        System.out.println(name);
    }
}
