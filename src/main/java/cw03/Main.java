package cw03;

/**
 * Created by evgeniy on 17/08/16.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee();

        employeeOne.setName("Ivan");
        employeeOne.setAge(12);

        // employeeOne.salary = 100;

        employeeTwo.setName("Andrey");

        System.out.println(Employee.gossip);

    }
}
