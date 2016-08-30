package cw09.compare;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
    private String name;
    private int salary;
    private LocalDate birthday;

    public Employee(String name, int salary, LocalDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee that) {
        return this.salary - that.salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }
}
