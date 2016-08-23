package cw06.interfaces.with;

public class MercedesBenz extends Car implements Movable{

    public MercedesBenz(int speed) {
        super(speed);
    }

    public int getDistance(int hours) {
        return hours * speed;
    }
}
