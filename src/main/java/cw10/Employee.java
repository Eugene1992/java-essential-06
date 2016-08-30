package cw10;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;

public class Employee implements Cloneable {
    private String name;
    private int salary;
    private LocalDate birthday;

    public Employee(String name, int salary, LocalDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee employee = (Employee) obj;

        if (salary != employee.salary) return false;

        if (name != null) {
            if (!name.equals(employee.name)){
                return false;
            }
        } else {
            if (employee.name != null){
                return false;
            }
        }
        if (birthday != null) {
            return birthday.equals(employee.birthday);
        } else {
            return employee.birthday == null;
        }
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + salary;
        result = 31 * result + birthday.hashCode();
        return result;
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

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee evgeniy1 = new Employee("Evgeniy", 25000, LocalDate.of(1992, Month.DECEMBER, 26));
        Employee evgeniy2 = new Employee("Evgeniy", 25000, LocalDate.of(1992, Month.DECEMBER, 26));
        System.out.println(evgeniy1.equals(evgeniy2));
        System.out.println(evgeniy1.hashCode());
        System.out.println(evgeniy2.hashCode());
    }
}
