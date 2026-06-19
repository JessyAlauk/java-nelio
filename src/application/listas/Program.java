package application.listas;

import java.util.ArrayList;
import java.util.Comparator;

public class Program {
    static void main() {

        var list = new ArrayList<String>();

        list.add("Joao");
        list.add("Maria");
        list.add("Jose");
        list.add("Paulo");
        list.add("Pedro");

        list.add(2,"Dois");


        list.sort(Comparator.naturalOrder());
        list.forEach(System.out::println);

        list.remove("Maria");

        System.out.println("\n");

        list.removeIf(x -> x.charAt(0) == 'J');

        System.out.println(list.indexOf("Dois"));

        list.forEach(System.out::println);

        list.stream().filter(x -> x.charAt(0) == 'P')
                .toList()
                .forEach(System.out::println);

        var name = list.stream().filter(x -> x.charAt(0) == 'A')
                .findFirst().orElse("Nao tem esse nome aqui viu");
        System.out.println(name);
    }
}
