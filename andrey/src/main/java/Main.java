/**
 * 16.08.16.
 * @author Andrey Telegin
 *
 * The programm creates an array of 10 objects (10 big companies).
 * Sorts them by the profit, assets, Forbes List index and name.
 * Prints the sorted data in a table.
 * All the data is real and it corresponds to a Forbes report data on top 200 Ukraine companies as of 2015.
 * [url]http://forbes.net.ua/ratings/3[/url]
 * The numbers in profit, assets are in mlns. UAH
 */
public class Main{
    public static void main(String[] args){
        Company [] companyArray = new Company[10];
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

    /*	prints out the "name", "profit", "assets" and "Forbes list index" fields of a Company in array
    *	gets Company array as it's input
    */
    static void printCompanyArray(Company[] arCompany){
        final String LINE = "----------------------------------------------------";
        System.out.println(LINE);
        /* To make the names of equal lengths the loop below adds up certain amount of whitespaces
         * Again, this is for a good-looking output.
         */
        String nameWithSpaces;
        int maxName = getLongestName(arCompany);
        for (Company aComp: arCompany){
            nameWithSpaces = aComp.getName();
            while(nameWithSpaces.length() < maxName){
                nameWithSpaces += " ";
            }
            System.out.printf("%s \t %d \t %d   \t %d \n",nameWithSpaces,aComp.getProfit(),aComp.getAssets(),aComp.getForbesListIndex());
            /*System.out.println(nameWithSpaces+"\t"+arCompany[i].getProfit()+"\t\t"+arCompany[i].getAssets()+"\t\t"+arCompany[i].getForbesListIndex());*/
        }
        System.out.println(LINE);
    }

    /*	To make pretty good-looking table we must know the longest name's length.
    *	Just for the output purposes.
    */
    static int getLongestName(Company[] arCompany){
        int maxNameLength = arCompany[0].getName().length();
        for (Company elem:arCompany){
            if (elem.getName().length()>maxNameLength){
                maxNameLength = elem.getName().length();
            }
        }
        return maxNameLength;
    }

    /* A long boring series of the same classic bubble-sorting methods to sort Companies by a field.
    *	Repeating code IS bad.
    *  Should've done it with some universal method, yet don't know how.
    */
    static void sortByAssets(Company[] arCompany){
        int len = arCompany.length;
        for (int j=0; j<len-1; j++){
            for (int i=0; i<len-1; i++){
                if (arCompany[i+1].getAssets() > arCompany[i].getAssets()){
                    Company temp = arCompany[i+1];
                    arCompany[i+1] = arCompany[i];
                    arCompany[i] = temp;
                }
            }
        }
    }

    static void sortByProfit(Company[] arCompany){
        int len = arCompany.length;
        for (int j=0; j<len-1; j++){
            for (int i=0; i<len-1; i++){
                if (arCompany[i+1].getProfit() > arCompany[i].getProfit()){
                    Company temp = arCompany[i+1];
                    arCompany[i+1] = arCompany[i];
                    arCompany[i] = temp;
                }
            }
        }
    }

    static void sortByForbesIndex(Company[] arCompany){
        int len = arCompany.length;
        for (int j=0; j<len-1; j++){
            for (int i=0; i<len-1; i++){
                if (arCompany[i+1].getForbesListIndex() < arCompany[i].getForbesListIndex()){
                    Company temp = arCompany[i+1];
                    arCompany[i+1] = arCompany[i];
                    arCompany[i] = temp;
                }
            }
        }
    }

    /* This method is a bit different from the three above. A bit.
    *  The method 'compareToIgnoreCase()' makes a difference and it rocks!
    */
    static void sortByName(Company[] arCompany){
        int len = arCompany.length;

        for (int j=0; j<len-1; j++){
            for (int i=0; i<len-1; i++){
				/* int str1.compareToIgnoreCase(str2)*/
                if (arCompany[i+1].getName().compareToIgnoreCase(arCompany[i].getName()) < 0){
                    Company temp = arCompany[i+1];
                    arCompany[i+1] = arCompany[i];
                    arCompany[i] = temp;
                }
            }
        }
    }

    /*Methods creates objects of ' Company ' type, fills the fields with values
    * and assigns them to array elements.
    * Method gets an array of Company elements as it's input argument.
    */
    static void initCompanyArray(Company[] aCompanyArray){
        //assert aCompanyArray.length == 10;
        System.out.println("Initializing array...");

        Company metinvest = new Company();
        metinvest.setName("Metinvest");
        metinvest.setProfit(2512);
        metinvest.setAssets(31756);
        metinvest.setForbesListIndex(1);

        aCompanyArray[0] = metinvest;

        Company privatbank = new Company();
        privatbank.setName("PrivatBank");
        privatbank.setProfit(749);
        privatbank.setAssets(204585);
        privatbank.setForbesListIndex(3);

        aCompanyArray[1] = privatbank;

        Company motorsich = new Company();
        motorsich.setName("Motor Sich");
        motorsich.setProfit(1547);
        motorsich.setAssets(16041);
        motorsich.setForbesListIndex(8);

        aCompanyArray[2] = motorsich;

        Company roshen = new Company();
        roshen.setName("Roshen");
        roshen.setProfit(1085);
        roshen.setAssets(6577);
        roshen.setForbesListIndex(13);

        aCompanyArray[3] = roshen;

        Company philipmorris = new Company();
        philipmorris.setName("Philip Morris Ukraine");
        philipmorris.setProfit(746);
        philipmorris.setAssets(4137);
        philipmorris.setForbesListIndex(17);

        aCompanyArray[4] = philipmorris;

        Company atb = new Company();
        atb.setName("ATB-Market");
        atb.setProfit(-181);
        atb.setAssets(5461);
        atb.setForbesListIndex(29);

        aCompanyArray[5] = atb;

        Company epicentr = new Company();
        epicentr.setName("Epitsentr K");
        epicentr.setProfit(5273);
        epicentr.setAssets(11240);
        epicentr.setForbesListIndex(9);

        aCompanyArray[6] = epicentr;

        Company ukrtatnafta = new Company();
        ukrtatnafta.setName("UkrTatNafta");
        ukrtatnafta.setProfit(104);
        ukrtatnafta.setAssets(8720);
        ukrtatnafta.setForbesListIndex(15);

        aCompanyArray[7] = ukrtatnafta;

        Company kievstar = new Company();
        kievstar.setName("Kyivstar");
        kievstar.setProfit(2195);
        kievstar.setAssets(13513);
        kievstar.setForbesListIndex(4);

        aCompanyArray[8] = kievstar;

        Company carlsberg = new Company();
        carlsberg.setName("Carlsberg Ukraine");
        carlsberg.setProfit(1456);
        carlsberg.setAssets(4065);
        carlsberg.setForbesListIndex(23);

        aCompanyArray[9] = carlsberg;
    }
}