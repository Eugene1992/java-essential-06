package cw06.interfaces.without;

public abstract class MovableUnit {
    protected int speed;

    public MovableUnit(int speed) {
        this.speed = speed;
    }

    protected abstract int getDistance(int hours);
}
