package homework03;

import java.util.ArrayList;

/**
 * @author Andrey Telegin
 */

class AList extends MyList {

    @Override
    public void start() {
        doTestAdd();
        doTestGet();
        doTestRemove();
        doTestSet();
    }

    @Override
    public double setFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        ArrayList<Integer> aList = new ArrayList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS + startIndex;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                aList.add(ELEMVALUE ^ 0xaaaaaa);
            }
            if (startIndex >= NUMOFELEMENTS / 2) {
                start = System.currentTimeMillis();
                for (int i = aList.size() - 1; i >= NUMOFELEMENTS - startIndex; i--) {
                    aList.set(i, ELEMVALUE);
                }
                stop = System.currentTimeMillis();
            } else {
                start = System.currentTimeMillis();
                for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                    aList.set(i, ELEMVALUE);
                }
                stop = System.currentTimeMillis();
            }
            timeSet[j] = stop - start;
            aList.clear();
        }
        result = getMean(timeSet);
        return result;
    }

    @Override
    public double getFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        ArrayList<Integer> aList = new ArrayList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS + startIndex;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                aList.add(ELEMVALUE);
            }
            if (startIndex >= NUMOFELEMENTS / 2) {
                start = System.currentTimeMillis();
                for (int i = aList.size() - 1; i >= NUMOFELEMENTS - startIndex; i--) {
                    aList.get(i);
                }
                stop = System.currentTimeMillis();
            } else {
                start = System.currentTimeMillis();
                for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                    aList.get(i);
                }
                stop = System.currentTimeMillis();
            }
            timeSet[j] = stop - start;
            aList.clear();
        }
        result = getMean(timeSet);
        return result;
    }

    @Override
    public double removeFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        ArrayList<Integer> aList = new ArrayList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS + startIndex; //increase the array so as to be sure we remove NUMOFELEMENTS elements

        for (int j = 0; j < timeSet.length - 1; j++) {
            //Fill an ArrayList with elements
            for (int i = 0; i < INITSIZE; i++) {
                aList.add(ELEMVALUE);
            }
            if (startIndex >= NUMOFELEMENTS / 2) {
                start = System.currentTimeMillis();
                for (int i = aList.size() - 1; i >= NUMOFELEMENTS - startIndex; i--) {
                    aList.remove(i);
                }
                stop = System.currentTimeMillis();
            } else {
                start = System.currentTimeMillis();
                for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                    aList.remove(0);
                }
                stop = System.currentTimeMillis();
            }
            timeSet[j] = stop - start;
            aList.clear();
        }
        result = getMean(timeSet);
        return result;
    }

    /**
     * @param startIndex Starting index from which the adding of elements to the array is performed.
     */
    @Override
    public double addFromIndex(int startIndex) {
        double result;
        ArrayList<Integer> aList = new ArrayList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                aList.add(ELEMVALUE);
            }
            long start = System.currentTimeMillis();
            for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                aList.add(i, ELEMVALUE);
            }
            long stop = System.currentTimeMillis();
            timeSet[j] = stop - start;
            aList.clear();
        }
        result = getMean(timeSet);
        return result;
    }
}