package HomeworkOne;

/**
 * Created by ivan on 19.08.16.
 */
public class EmployeeService {
    public static int sortByAge(Employee[] arr){
        int index = 0;
        int max = arr[0].getAge();
        for(int i = 1; i < arr.length ;i++)
        {
            if (max < arr[i].getAge())
            {
                max = arr[i].getAge();
                index =i;
            }
        }
        return index;
    }
    public static int sortBySalary(Employee[] arr){
        int index = 0;
        int max = arr[0].getSalary();
        for(int i = 1; i < arr.length ;i++)
        {
            if (max < arr[i].getSalary())
            {
                max = arr[i].getSalary();
                index =i;
            }
        }
        return index;
    }
}
