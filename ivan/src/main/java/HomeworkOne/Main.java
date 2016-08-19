package HomeworkOne;

/**
 * Created by ivan on 19.08.16.
 */
public class Main {
    public static void main(String[] args) {
        Employee[] arrEmp = employess();
        System.out.println(arrEmp[EmployeeService.sortByAge(arrEmp)].getName() + "- the oldest employee.");
        System.out.println(arrEmp[EmployeeService.sortBySalary(arrEmp)].getName() + "- has the haighedt salary.");
    }

    static Employee[] employess() {

        Employee[] arrEmployee = new Employee[3];

        Employee emplOne = new Employee();
        emplOne.setName("Vasiliy");
        emplOne.setAge(25);
        emplOne.setSalary(1000);

        arrEmployee[0] = emplOne;

        Employee emplTwo = new Employee();
        emplTwo.setName("Luda");
        emplTwo.setAge(60);
        emplTwo.setSalary(100);

        arrEmployee[1] = emplTwo;

        Employee emplThre = new Employee();
        emplThre.setName("Borat");
        emplThre.setAge(19);
        emplThre.setSalary(1200);

        arrEmployee[2] = emplThre;

        return arrEmployee;
    }
}
