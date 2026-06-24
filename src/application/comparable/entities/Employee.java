package application.comparable.entities;

public record Employee(String name, double salary) implements Comparable<Employee>{

    @Override
    public int compareTo(Employee o) {
        return name.compareTo(o.name());
    }
}
