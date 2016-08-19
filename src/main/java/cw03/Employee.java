package cw03;

/**
 * Created by evgeniy on 17/08/16.
 */
public class Employee {
    private String name;
    private int myAge;
    private int salary;
    public static boolean gossip = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private void inEngine() {
       //
       //
       //
    }

    public void onSport() {
        inEngine();
    }

    public void on() {
        inEngine();
        System.out.println(name);
    }

    static void doSomething(Employee employee){
        System.out.println(employee.name);
    }
}
