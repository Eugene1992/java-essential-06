/**
 * Created by Станислав on 15.08.2016.
 */
public class Employee {
    public static void main(String[] args) {
        String[] names = {"Henry", "Artur", "Ben", "Jack", "John"};
        int[] ages = {24, 38, 48, 27, 32};
        int[] salaries = {1231, 1532, 4321, 2223, 3145};
        int index = getMaxSalaryIndex(salaries);
        System.out.println(names[index] + " has the largest salary which is " + salaries[index] + "$ per month");
        int index1 = getTheEldestMan(ages);
        System.out.println("The eldest is " + ages[index1]);
    }

    static int getMaxSalaryIndex(int[] salaries) {
        int max = salaries[0];
        int index = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (max < salaries[i]) {
                max = salaries[i];
                index = i;
            }
        }
        return index;
    }

    static int getTheEldestMan(int[] ages) {
        int max = ages[0];
        int index1 = 0;
        for (int i = 0; i < ages.length; i++) {
            if (max < ages[i]) {
                max = ages[i];
                index1 = i;
            }
        }
        return index1;
    }
}
