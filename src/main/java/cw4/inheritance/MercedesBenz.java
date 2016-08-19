package cw4.inheritance;

public class MercedesBenz extends Car {
    private String unicStar;

    public MercedesBenz(String model, String color, String unicStar) {
        super(model, color);
        this.unicStar = unicStar;
    }

    public String getUnicStar() {
        return unicStar;
    }

    void benzMethod(){

    }
}
