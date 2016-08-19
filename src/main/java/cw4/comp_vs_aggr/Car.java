package cw4.comp_vs_aggr;

/**
 * Created by evgeniy on 18/08/16.
 */
class Car {

    private String model;
    private String color;
    private Freshener freshener = new Freshener("Tree", "Vanilla");

    public Car() {
    }

    public Car(Freshener freshener) {
        this. freshener = freshener;
    }

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    /*public void setFreshener(Freshener freshener) {
        this.freshener = freshener;
    }*/

    public Freshener getFreshener() {
        return freshener;
    }


}

