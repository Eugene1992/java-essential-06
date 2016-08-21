package homework01;

/**
 * @author Andrey Telegin
 *         <p> Class homework01.CompanyProcess contains methods to initialize and process an array of homework01.Company.</p>
 */
class CompanyProcess {
    /**
     * Method creates an array of 'homework01.Company', initializes, processes and prints out processed information.
     */
    void start() {
        /**
         * array companyArray of 10 elements of homework01.Company
         */
        Company[] companyArray = new Company[10];

        initCompanyArray(companyArray);

        sortByProfit(companyArray);
        System.out.println("Let's get the array sorted by the company's profit.");
        printCompanyArray(companyArray);

        sortByAssets(companyArray);
        System.out.println("Let's get the array sorted by the company's assets.");
        printCompanyArray(companyArray);

        sortByForbesIndex(companyArray);
        System.out.println("Let's get the array sorted by Forbes list index.");
        printCompanyArray(companyArray);

        sortByName(companyArray);
        System.out.println("Let's get the array sorted by the company's name.");
        printCompanyArray(companyArray);
    }

    /**
     * Prints out the "name", "profit", "assets" and "Forbes list index" fields of a homework01.Company in array
     *
     * @param arrCompany An array to be printed
     */
    private static void printCompanyArray(Company[] arrCompany) {
        final String LINE = "----------------------------------------------------";
        System.out.println(LINE);
        String nameWithSpaces;
        int maxName = getLongestName(arrCompany);
        for (Company aComp : arrCompany) {
            nameWithSpaces = aComp.getName();
            while (nameWithSpaces.length() < maxName) {
                nameWithSpaces += " ";
            }
            System.out.printf("%s \t %d \t %d   \t %d \n", nameWithSpaces, aComp.getProfit(), aComp.getAssets(), aComp.getForbesListIndex());
            /*System.out.println(nameWithSpaces+"\t"+arrCompany[i].getProfit()+"\t\t"+arrCompany[i].getAssets()+"\t\t"+arrCompany[i].getForbesListIndex());*/
        }
        System.out.println(LINE);
    }

    /**
     * Method sorts the elements of an array by the values of 'name' field.
     *
     * @param arrCompany an array of type homework01.Company to be sorted.
     */
    private static void sortByName(Company[] arrCompany) {
        int len = arrCompany.length;

        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrCompany[i + 1].getName().compareToIgnoreCase(arrCompany[i].getName()) < 0) {
                    Company temp = arrCompany[i + 1];
                    arrCompany[i + 1] = arrCompany[i];
                    arrCompany[i] = temp;
                }
            }
        }
    }

    /**
     * Method sorts the elements of an array by the values of 'Forbes list index' field.
     *
     * @param arrCompany an array of type homework01.Company to be sorted.
     */
    private static void sortByForbesIndex(Company[] arrCompany) {
        int len = arrCompany.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrCompany[i + 1].getForbesListIndex() < arrCompany[i].getForbesListIndex()) {
                    Company temp = arrCompany[i + 1];
                    arrCompany[i + 1] = arrCompany[i];
                    arrCompany[i] = temp;
                }
            }
        }
    }

    /**
     * Method sorts the elements of an array by the values of 'profit' field.
     *
     * @param arrCompany an array of type homework01.Company to be sorted.
     */
    private static void sortByProfit(Company[] arrCompany) {
        int len = arrCompany.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrCompany[i + 1].getProfit() > arrCompany[i].getProfit()) {
                    Company temp = arrCompany[i + 1];
                    arrCompany[i + 1] = arrCompany[i];
                    arrCompany[i] = temp;
                }
            }
        }
    }

    /**
     * Method sorts the elements of an array by the values of 'assets' field.
     *
     * @param arrCompany an array of type homework01.Company to be sorted.
     */
    private static void sortByAssets(Company[] arrCompany) {
        int len = arrCompany.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrCompany[i + 1].getAssets() > arrCompany[i].getAssets()) {
                    Company temp = arrCompany[i + 1];
                    arrCompany[i + 1] = arrCompany[i];
                    arrCompany[i] = temp;
                }
            }
        }
    }

    /**
     * method searches for the longest name in array.
     *
     * @param arrCompany an array of type homework01.Company to be sorted
     * @return maxNameLength int value of a longest name's length
     */
    private static int getLongestName(Company[] arrCompany) {
        int maxNameLength = arrCompany[0].getName().length();
        for (Company elem : arrCompany) {
            if (elem.getName().length() > maxNameLength) {
                maxNameLength = elem.getName().length();
            }
        }
        return maxNameLength;
    }

    /**
     * Method gets an array of homework01.Company elements as it's input argument and creates objects of ' homework01.Company ' type,
     * fills the fields with values and assigns them to array elements.
     *
     * @param arrCompany an array of type homework01.Company to be initialized.
     */
    private static void initCompanyArray(Company[] arrCompany) {
        System.out.println("Initializing array...");

        Company metinvest = new Company();
        metinvest.setName("Metinvest");
        metinvest.setProfit(2512);
        metinvest.setAssets(31756);
        metinvest.setForbesListIndex(1);

        arrCompany[0] = metinvest;

        Company privatbank = new Company();
        privatbank.setName("PrivatBank");
        privatbank.setProfit(749);
        privatbank.setAssets(204585);
        privatbank.setForbesListIndex(3);

        arrCompany[1] = privatbank;

        Company motorsich = new Company();
        motorsich.setName("Motor Sich");
        motorsich.setProfit(1547);
        motorsich.setAssets(16041);
        motorsich.setForbesListIndex(8);

        arrCompany[2] = motorsich;

        Company roshen = new Company();
        roshen.setName("Roshen");
        roshen.setProfit(1085);
        roshen.setAssets(6577);
        roshen.setForbesListIndex(13);

        arrCompany[3] = roshen;

        Company philipmorris = new Company();
        philipmorris.setName("Philip Morris Ukraine");
        philipmorris.setProfit(746);
        philipmorris.setAssets(4137);
        philipmorris.setForbesListIndex(17);

        arrCompany[4] = philipmorris;

        Company atb = new Company();
        atb.setName("ATB-Market");
        atb.setProfit(-181);
        atb.setAssets(5461);
        atb.setForbesListIndex(29);

        arrCompany[5] = atb;

        Company epicentr = new Company();
        epicentr.setName("Epitsentr K");
        epicentr.setProfit(5273);
        epicentr.setAssets(11240);
        epicentr.setForbesListIndex(9);

        arrCompany[6] = epicentr;

        Company ukrtatnafta = new Company();
        ukrtatnafta.setName("UkrTatNafta");
        ukrtatnafta.setProfit(104);
        ukrtatnafta.setAssets(8720);
        ukrtatnafta.setForbesListIndex(15);

        arrCompany[7] = ukrtatnafta;

        Company kievstar = new Company();
        kievstar.setName("Kyivstar");
        kievstar.setProfit(2195);
        kievstar.setAssets(13513);
        kievstar.setForbesListIndex(4);

        arrCompany[8] = kievstar;

        Company carlsberg = new Company();
        carlsberg.setName("Carlsberg Ukraine");
        carlsberg.setProfit(1456);
        carlsberg.setAssets(4065);
        carlsberg.setForbesListIndex(23);

        arrCompany[9] = carlsberg;
    }
}
