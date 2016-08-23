package cw06.interfaces.with;

public abstract class MovableUnit implements Cloneable {
    protected int speed;

    public MovableUnit(int speed) {
        this.speed = speed;
    }

    protected abstract int getDistance(int hours);
}
