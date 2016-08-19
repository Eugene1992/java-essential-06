package cw4.inheritance;

/**
 * Created by evgeniy on 18/08/16.
 */
public class MercedesStar extends Car {
    private String unicField;

    public MercedesStar(String model, String color, String unicField) {
        super(model, color);
        this.unicField = unicField;
    }
}
