/**
 * @author Andrey Telegin
 */
public class Company {
    /**
     * profit attribute shows the company's profit in mln.UAH for 2015
     */
    private int profit;
    /**
     * assets attribute shows the company's asset in mln.UAH as of 2015
     */
    private int assets;
    /**
     * name attribute
     */
    private String name;
    /**
     * Forbes list index shows the index of a company in Forbes list as of 2015.
     */
    private int forbesListIndex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getProfit() {
        return this.profit;
    }

    public void setAssets(int assets) {
        this.assets = assets;
    }

    public int getAssets() {
        return this.assets;
    }

    public void setForbesListIndex(int forbesListIndex) {
        this.forbesListIndex = forbesListIndex;
    }

    public int getForbesListIndex() {
        return this.forbesListIndex;
    }
}