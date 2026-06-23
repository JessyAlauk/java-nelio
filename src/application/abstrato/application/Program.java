package application.abstrato.application;

import application.abstrato.entities.Circle;
import application.abstrato.entities.Color;
import application.abstrato.entities.Rectangle;

public class Program {
    static void main() {
        System.out.println("Retangulo");

        var retangulo = new Rectangle(Color.BLACK,
                100.0, 150.0);

        System.out.println(String.format("%.2f", retangulo.area()));

        System.out.println("Circulo");

        var circulo = new Circle(Color.RED,
                14.0);

        System.out.println(String.format("%.2f", circulo.area()));
    }
}
