package application.listas;

import application.listas.entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    static void main() {
        var employee1 = new Employee(1,"Ana Maria", 2000.50);
        var employee2 = new Employee(2,"Joao Paulo", 12000);
        var employee3 = new Employee(3,"Jose Carlos", 1000);
        var employee4 = new Employee(4,"Jessica", 15000);
        var employee5 = new Employee(5,"Elivelton", 3000.70);
        var employees = new ArrayList<Employee>();

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        employees.forEach(System.out::println);

        employees.stream()
                .filter(f -> f.getId() == 3)
                .findFirst()
                .orElseThrow(RuntimeException::new);

        for (var employee : employees) {
            if (employee.getId() == 3) {
                employee.increaseSalaryByPercent(10);
            }
        }
    }
}
