package application;

public class StaticMember {

    public static final double PI = 3.14159;

    static void main() {
        System.out.println();

        double radius = 0.3;

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circunferencia: %f", c);
        System.out.printf("\nVolume: %f", v);
    }


    private static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    private static double volume(double radius) {
        return 4.0 * PI * radius * radius / 3.0;
    }


}
