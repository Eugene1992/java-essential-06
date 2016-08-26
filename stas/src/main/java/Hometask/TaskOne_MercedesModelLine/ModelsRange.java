package Hometask.TaskOne_MercedesModelLine;

/**
 * Created by Станислав on 19.08.2016.
 */
public class ModelsRange {
    void start() {
        Car[] carArray = new Car[10];
        initParametersArray(carArray);

        sortByName(carArray);
        System.out.println("Let's get the array sorted by the model's name.");
        printParametersArray(carArray);

       /** sortByCarBody(carArray);
        System.out.println("Let's get the array sorted by the car's body modification.");
        printParametersArray(carArray);*/

        sortByEngineVolume(carArray);
        System.out.println("Let's get the array sorted by Forbes list index.");
        printParametersArray(carArray);

        sortByEnginePower(carArray);
        System.out.println("Let's get the array sorted by the company's name.");
        printParametersArray(carArray);

        sortByPrice(carArray);
        System.out.println("Let's get the array sorted by the company's name.");
        printParametersArray(carArray);






    }

    private static void printParametersArray(Car[] arrParameters) {
        final String LINE = "----------------------------------------------------";
        System.out.println(LINE);
        String nameWithSpaces;
        int maxName = getLongestName(arrParameters);
        for (Car aComp : arrParameters) {
            nameWithSpaces = aComp.getName();
            while (nameWithSpaces.length() < maxName) {
                nameWithSpaces += " ";
            }
            System.out.printf("%s \t %d \t %d   \t %d \n", nameWithSpaces, aComp.getName(), aComp.getCarBody(), aComp.getEngineVolume(), aComp.getEnginePower(), aComp.getPrice());
            /*System.out.println(nameWithSpaces+"\t"+arrCompany[i].getProfit()+"\t\t"+arrCompany[i].getAssets()+"\t\t"+arrCompany[i].getForbesListIndex());*/
        }
        System.out.println(LINE);
    }

    /**
     * Method sorts the elements of an array by the values of 'name' field.
     *
     * @param arrParameters an array of type Company to be sorted.
     */
    private static void sortByName(Car[] arrParameters) {
        int len = arrParameters.length;

        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrParameters[i + 1].getName().compareToIgnoreCase(arrParameters[i].getName()) < 0) {
                    Car temp = arrParameters[i + 1];
                    arrParameters[i + 1] = arrParameters[i];
                    arrParameters[i] = temp;
                }
            }
        }
    }

    /**
     * Method sorts the elements of an array by the values of 'Forbes list index' field.
     *
     * @param arrParameters an array of type Company to be sorted.
     */
    private static void sortByForbesIndex(Car[] arrParameters) {
        int len = arrParameters.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrParameters[i + 1].getCarBody().compareToIgnoreCase(arrParameters[i].getCarBody())< 0){
                    Car temp = arrParameters[i + 1];
                    arrParameters[i + 1] = arrParameters[i];
                    arrParameters[i] = temp;
                }
            }
        }
    }

    /**
     * Method sorts the elements of an array by the values of 'profit' field.
     *
     * @param arrParameters an array of type Company to be sorted.
     */
    private static void sortByEngineVolume(Car[] arrParameters) {
        int len = arrParameters.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrParameters[i + 1].getEngineVolume() > arrParameters[i].getEngineVolume()) {
                    Car temp = arrParameters[i + 1];
                    arrParameters[i + 1] = arrParameters[i];
                    arrParameters[i] = temp;
                }
            }
        }
    }

    /**
     * Method sorts the elements of an array by the values of 'assets' field.
     *
     * @param arrParameters an array of type Company to be sorted.
     */
    private static void sortByEnginePower(Car[] arrParameters) {
        int len = arrParameters.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrParameters[i + 1].getEnginePower() > arrParameters[i].getEnginePower()) {
                    Car temp = arrParameters[i + 1];
                    arrParameters[i + 1] = arrParameters[i];
                    arrParameters[i] = temp;
                }
            }
        }
    }



    private static void sortByPrice(Car[] arrParameters) {
        int len = arrParameters.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrParameters[i + 1].getPrice() > arrParameters[i].getPrice()) {
                    Car temp = arrParameters[i + 1];
                    arrParameters[i + 1] = arrParameters[i];
                    arrParameters[i] = temp;
                }
            }
        }
    }



    /**
     * method searches for the longest name in array.
     *
     * @param arrParameters an array of type Company to be sorted
     * @return maxNameLength int value of a longest name's length
     */
    private static int getLongestName(Car[] arrParameters) {
        int maxNameLength = arrParameters[0].getName().length();
        for (Car elem : arrParameters) {
            if (elem.getName().length() > maxNameLength) {
                maxNameLength = elem.getName().length();
            }
        }
        return maxNameLength;
    }

    /**
     * Method gets an array of Company elements as it's input argument and creates objects of ' Company ' type,
     * fills the fields with values and assigns them to array elements.
     *
     * @param arrParameters an array of type Company to be initialized.
     */
    private static void initParametersArray(Car[] arrParameters) {
        System.out.println("Initializing array...");

        Car C_class = new Car();
        C_class.setName("C_class");
        C_class.setCarBody("sedan");
        C_class.setEngineVolume(2);
        C_class.setEnginePower(194);
        C_class.setPrice(45000);

        arrParameters[0] = C_class;

        Car E_class = new Car();
        C_class.setName("E_class");
        C_class.setCarBody("sedan");
        C_class.setEngineVolume(3);
        C_class.setEnginePower(256);
        C_class.setPrice(50000);

        arrParameters[1] = E_class;

        Car S_class = new Car();
        C_class.setName("S_class");
        C_class.setCarBody("sedan");
        C_class.setEngineVolume(5);
        C_class.setEnginePower(454);
        C_class.setPrice(100000);

        arrParameters[2] = S_class;

        Car G_class = new Car();
        C_class.setName("G_class");
        C_class.setCarBody("SUV");
        C_class.setEngineVolume(6);
        C_class.setEnginePower(555);
        C_class.setPrice(130000);

        arrParameters[3] = G_class;

        Car GLE_class = new Car();
        C_class.setName("GLE_class");
        C_class.setCarBody("SUV");
        C_class.setEngineVolume(3);
        C_class.setEnginePower(258);
        C_class.setPrice(80000);

        arrParameters[4] = GLE_class;

        Car GLE_Coupe_class = new Car();
        C_class.setName("GLE_Coupe_class");
        C_class.setCarBody("sport coupe");
        C_class.setEngineVolume(3);
        C_class.setEnginePower(333);
        C_class.setPrice(90000);

        arrParameters[5] = GLE_Coupe_class;

        Car GLS_class = new Car();
        C_class.setName("GLS_class");
        C_class.setCarBody("SUV");
        C_class.setEngineVolume(4);
        C_class.setEnginePower(340);
        C_class.setPrice(120000);

        arrParameters[6] = GLS_class;


    }
}

