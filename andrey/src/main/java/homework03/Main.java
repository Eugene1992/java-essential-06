package homework03;

/**
 * @author Andrey Telegin
 */
class Main {

    public static void main(String[] args) {
        MyList aList = new AList();
        aList.start();

        MyList lList = new LList();
        lList.start();

        MyList.printPerformance(aList, lList);
    }
}
