package cw09;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Java8Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Evgeniy", 25000, LocalDate.of(1992, 12, 26), Gender.MALE),
                new Employee("Olga", 1700, LocalDate.of(1984, 7, 16), Gender.FEMALE),
                new Employee("Sergey", 4300, LocalDate.of(1987, 9, 8), Gender.MALE),
                new Employee("Stanislav", 12000, LocalDate.of(1991, 4, 23), Gender.MALE),
                new Employee("Ksenia", 7000, LocalDate.of(1995, 7, 16), Gender.FEMALE)
        );

        employees
                .stream()
                .filter(e -> e.gender == Gender.MALE && e.salary > 10_000)
                .forEach(System.out::println);

        /*System.out.println();

        employees
                .stream()
                .map(e -> e.salary + 10000)
                .forEach(System.out::println);

        System.out.println();

        System.out.println(employees
                .stream()
                .anyMatch(e -> e.gender == Gender.MALE && e.salary > 10_000)
        );

        System.out.println();

        long employee = employees.stream().peek(System.out::println).count();

        System.out.println(employee);*/
    }

    static class Employee {
        private String name;
        private int salary;
        private LocalDate birthday;
        private Gender gender;

        public Employee(String name, int salary, LocalDate birthday, Gender gender) {
            this.name = name;
            this.salary = salary;
            this.birthday = birthday;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "[" + name + " | " + salary + " | " + birthday + " | " + gender + ']';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
