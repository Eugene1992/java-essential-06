package cw06.interfaces.without;

public class MercedesBenz extends MovableUnit {

    public MercedesBenz(int speed) {
        super(speed);
    }

    @Override
    public int getDistance(int hours) {
        return hours * speed;
    }
}
