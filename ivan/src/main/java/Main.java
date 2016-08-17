/**
 * Created by evgeniy on 16/08/16.
 */
public class Main {
    public static class Employee {
        String name;
        int age;
        int salary;

        Employee (String n, int a, int s)
        {
            name = n;
            age = a;
            salary = s;
        }

    }


    public static int Sort(int[] arr)
    {
        int ind = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
                ind = i;
            }
        }
        return ind;
    }

    public static void main(String[] args){


        Employee empl1 = new Employee("Loz", 22, 1000);
        Employee empl2 = new Employee("Lozuis", 32, 2000);
        Employee empl3 = new Employee("Lozzer", 42, 3000);
        Employee empl4 = new Employee("Lozantus", 52, 4000);
        Employee empl5 = new Employee("L", 62, 5000);

        int[] names_lenght = {empl1.name.length(), empl2.name.length(), empl3.name.length(), empl4.name.length(), empl5.name.length()};
        int[] ages = {empl1.age, empl2.age, empl3.age, empl4.age, empl5.age};
        int[] salaries = {empl1.salary, empl2.salary, empl3.salary, empl4.salary, empl5.salary};
        String[] names = {empl1.name, empl2.name, empl3.name, empl4.name, empl5.name};


        String res1 = names[Sort(names_lenght)];
        String res2 = names[Sort(ages)];
        String res3 = names[Sort(salaries)];
        System.out.println("Longest name :" + res1);
        System.out.println("Oldest employee :" + res2);
        System.out.println("Highest salary :" + res3);
    }
}
