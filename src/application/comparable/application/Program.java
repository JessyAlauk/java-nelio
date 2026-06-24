package application.comparable.application;

import application.comparable.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main() {
        List<Employee> list = new ArrayList<>();
        String path = "/home/jessy-alauk/Documentos/in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employee = br.readLine();
            while (employee != null) {
                String[] fields = employee.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employee = br.readLine();
            }
            Collections.sort(list);
            for (Employee s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
