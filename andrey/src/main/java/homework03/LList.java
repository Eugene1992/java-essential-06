package homework03;

import java.util.LinkedList;

/**
 * @author Andrey Telegin
 */

class LList extends MyList {

    @Override
    public void start() {
        doTestAdd();
        doTestGet();
        doTestRemove();
        doTestSet();
    }

    /**
     * @param startIndex
     */
    @Override
    public double setFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        LinkedList<Integer> lList = new LinkedList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS + startIndex;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                lList.add(ELEMVALUE ^ 0xaaaaaa);
            }
            if (startIndex >= NUMOFELEMENTS / 2) {
                start = System.currentTimeMillis();
                for (int i = lList.size() - 1; i >= NUMOFELEMENTS - startIndex; i--) {
                    lList.set(i, ELEMVALUE);
                }
                stop = System.currentTimeMillis();
            } else {
                start = System.currentTimeMillis();
                for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                    lList.set(i, ELEMVALUE);
                }
                stop = System.currentTimeMillis();
            }
            timeSet[j] = stop - start;
            lList.clear();
        }
        result = getMean(timeSet);
        return result;
    }

    /**
     * @param startIndex
     */
    @Override
    public double getFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        LinkedList<Integer> lList = new LinkedList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS + startIndex;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                lList.add(ELEMVALUE);
            }
            if (startIndex >= NUMOFELEMENTS / 2) {
                start = System.currentTimeMillis();
                for (int i = lList.size() - 1; i >= NUMOFELEMENTS - startIndex; i--) {
                    lList.get(i);
                }
                stop = System.currentTimeMillis();
            } else {
                start = System.currentTimeMillis();
                for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                    lList.get(i);
                }
                stop = System.currentTimeMillis();
            }
            timeSet[j] = stop - start;
            lList.clear();
        }
        result = getMean(timeSet);
        return result;
    }

    /**
     * @param startIndex
     */
    @Override
    public double removeFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        LinkedList<Integer> lList = new LinkedList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS + startIndex;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                lList.add(ELEMVALUE);
            }
            if (startIndex >= NUMOFELEMENTS / 2) {
                start = System.currentTimeMillis();
                for (int i = lList.size() - 1; i >= NUMOFELEMENTS - startIndex; i--) {
                    lList.remove(i);
                }
                stop = System.currentTimeMillis();
            } else {
                start = System.currentTimeMillis();
                for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                    lList.remove(0);
                }
                stop = System.currentTimeMillis();
            }
            timeSet[j] = stop - start;
            lList.clear();
        }
        result = getMean(timeSet);
        return result;
    }

    /**
     * @param startIndex
     */
    @Override
    public double addFromIndex(int startIndex) {
        double result;
        long start;
        long stop;
        LinkedList<Integer> lList = new LinkedList<>();
        long[] timeSet = new long[TIMESTORUN];
        final int INITSIZE = NUMOFELEMENTS;

        for (int j = 0; j < timeSet.length - 1; j++) {
            for (int i = 0; i < INITSIZE; i++) {
                lList.add(ELEMVALUE);
            }
            start = System.currentTimeMillis();
            for (int i = startIndex; i < startIndex + NUMOFELEMENTS; i++) {
                lList.add(i, ELEMVALUE);
            }
            stop = System.currentTimeMillis();
            timeSet[j] = stop - start;
            lList.clear();
        }
        result = getMean(timeSet);
        return result;
    }
}