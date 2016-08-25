package homework03;

/**
 * @author Andrey Telegin
 */
abstract class MyList {
    private static final String LINE = "--------------------------------------------------------";
    static final int NUMOFELEMENTS = 10_000;
    static final int ELEMVALUE = 0xffffff;
    static final int TIMESTORUN = 8; //the bigger this one is, the better statistics is

    private double[] testAdd;
    private double[] testRemove;
    private double[] testSet;
    private double[] testGet;

    static double getMean(long[] array) {
        double sum = 0;
        for (long element : array) {
            sum += (double) element;
        }
        return sum / array.length;
    }

    void doTestAdd() {
        testAdd = new double[3];
        testAdd[0] = addFromIndex(0);
        testAdd[1] = addFromIndex(NUMOFELEMENTS / 2);
        testAdd[2] = addFromIndex(NUMOFELEMENTS);
    }

    void doTestSet() {
        testSet = new double[3];
        testSet[0] = setFromIndex(0);
        testSet[1] = setFromIndex(NUMOFELEMENTS / 2);
        testSet[2] = setFromIndex(NUMOFELEMENTS);
    }

    void doTestGet() {
        testGet = new double[3];
        testGet[0] = getFromIndex(0);
        testGet[1] = getFromIndex(NUMOFELEMENTS / 2);
        testGet[2] = getFromIndex(NUMOFELEMENTS);
    }

    void doTestRemove() {
        testRemove = new double[3];
        testRemove[0] = removeFromIndex(0);
        testRemove[1] = removeFromIndex(NUMOFELEMENTS / 2);
        testRemove[2] = removeFromIndex(NUMOFELEMENTS);
    }

    abstract public double setFromIndex(int startIndex);

    abstract public double addFromIndex(int startIndex);

    abstract public double removeFromIndex(int startIndex);

    abstract public double getFromIndex(int startIndex);

    abstract public void start();

    static void printPerformance(MyList mListOne, MyList mListTwo) {
        System.out.println(LINE);
        System.out.println("Method 'add()' and its performance: ");
        System.out.println("From begin:  " + mListOne.testAdd[0] + "\t\t" + mListTwo.testAdd[0]);
        System.out.println("From middle: " + mListOne.testAdd[1] + "\t\t" + mListTwo.testAdd[1]);
        System.out.println("From end:    " + mListOne.testAdd[2] + "\t\t" + mListTwo.testAdd[2]);
        System.out.println(LINE);
        System.out.println("Method 'remove()' and its performance: ");
        System.out.println("From begin:  " + mListOne.testRemove[0] + "\t\t" + mListTwo.testRemove[0]);
        System.out.println("From middle: " + mListOne.testRemove[1] + "\t\t" + mListTwo.testRemove[1]);
        System.out.println("From end:    " + mListOne.testRemove[2] + "\t\t" + mListTwo.testRemove[2]);
        System.out.println(LINE);
        System.out.println("Method 'set()' and its performance: ");
        System.out.println("From begin:  " + mListOne.testSet[0] + "\t\t" + mListTwo.testSet[0]);
        System.out.println("From middle: " + mListOne.testSet[1] + "\t\t" + mListTwo.testSet[1]);
        System.out.println("From end:    " + mListOne.testSet[2] + "\t\t" + mListTwo.testSet[2]);
        System.out.println(LINE);
        System.out.println("Method 'get()' and its performance: ");
        System.out.println("From begin:  " + mListOne.testGet[0] + "\t\t" + mListTwo.testGet[0]);
        System.out.println("From middle: " + mListOne.testGet[1] + "\t\t" + mListTwo.testGet[1]);
        System.out.println("From end:    " + mListOne.testGet[2] + "\t\t" + mListTwo.testGet[2]);
    }

}
