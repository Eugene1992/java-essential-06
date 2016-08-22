package cw06.interfaces.without;

public class HomeDog extends MovableUnit {

    public HomeDog(int speed) {
        super(speed);
    }

    @Override
    public int getDistance(int hours) {
        return hours * speed;
    }
}
