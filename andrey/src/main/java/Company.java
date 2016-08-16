/**
 * Andrey on 16.08.16.
 */
public class Company{
    private int profit;
    private int assets;
    private String name;
    private int forbesListIndex;

    //Name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    //Profit
    public void setProfit(int profit){
        this.profit = profit;
    }
    public int getProfit(){
        return this.profit;
    }

    //Asset
    public void setAssets(int assets){
        this.assets = assets;
    }
    public int getAssets(){
        return this.assets;
    }

    //Forbes List Index
    public void setForbesListIndex(int forbesListIndex){
        this.forbesListIndex = forbesListIndex;
    }
    public int getForbesListIndex(){
        return this.forbesListIndex;
    }
}