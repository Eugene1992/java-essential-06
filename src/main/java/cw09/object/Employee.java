package cw09.object;

import java.time.LocalDate;
import java.time.Month;

public class Employee implements Cloneable {
    private String name;
    private int salary;
    private LocalDate birthday;

    public Employee(String name, int salary, LocalDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public Employee(Employee employee) {
        this.name = new String(employee.getName());
        this.salary = employee.getSalary();
        this.birthday = employee.getBirthday();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm die...");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee evgeniy1 = new Employee("Evgeniy", 25000, LocalDate.of(1992, Month.DECEMBER, 26));
        Employee evgeniy2 = new Employee("Evgeniy", 25000, LocalDate.of(1992, Month.DECEMBER, 26));
        evgeniy2 = evgeniy1;
        System.out.println(evgeniy1 == evgeniy2);
        System.out.println(evgeniy1.equals(evgeniy2));
    }
}
