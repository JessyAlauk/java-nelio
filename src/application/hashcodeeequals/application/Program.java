package application.hashcodeeequals.application;

import application.hashcodeeequals.entities.Client;

public class Program {
    static void main() {
        var c1 = new Client("Maria", "maria@gmail.com");
        var c2 = new Client("Joao", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
