/**
 * @author Andrey Telegin
 */
class Company {
    /**
     * profit attribute shows the company's profit in mln.UAH for 2015
     */
    private int profit;
    /**
     * assets attribute shows the company's asset in mln.UAH as of 2015
     */
    private int assets;
    /**
     * name attribute corresponds to a company's name.
     */
    private String name;
    /**
     * Forbes list index shows the index of a company in Forbes list as of 2015.
     */
    private int forbesListIndex;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setProfit(int profit) {
        this.profit = profit;
    }

    int getProfit() {
        return this.profit;
    }

    void setAssets(int assets) {
        this.assets = assets;
    }

    int getAssets() {
        return this.assets;
    }

    void setForbesListIndex(int forbesListIndex) {
        this.forbesListIndex = forbesListIndex;
    }

    int getForbesListIndex() {
        return this.forbesListIndex;
    }
}