package cw04.comp_vs_aggr;

/**
 * Created by evgeniy on 18/08/16.
 */
public class Main {
    public static void main(String[] args) {
        Freshener freshener1 = new Freshener("Tree", "Vanilla");
        Car car = new Car("Audi", "Blue", freshener1);
        Freshener freshener2 = new Freshener("Tree", "Ice");
        car = null;

        car.getFreshener();
    }
}
