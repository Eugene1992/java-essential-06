package cw09.compare;

import cw09.Java8Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Evgeniy", 25000, LocalDate.of(1992, Month.DECEMBER, 26)),
                new Employee("Olga", 1700, LocalDate.of(1984, 7, 16)),
                new Employee("Sergey", 4300, LocalDate.of(1987, 9, 8)),
                new Employee("Stanislav", 12000, LocalDate.of(1991, 4, 23)),
                new Employee("Ksenia", 7000, LocalDate.of(1995, 7, 16))
        );

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e2.getSalary() - e1.getSalary();
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("---------------------------------");

        Collections.sort(employees, (e1, e2) -> e1.getSalary() - e2.getSalary());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
