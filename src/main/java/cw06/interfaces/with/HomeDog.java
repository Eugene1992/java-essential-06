package cw06.interfaces.with;

import java.io.Serializable;

public class HomeDog extends Dog implements Movable, Cloneable, Serializable {

    public HomeDog(int speed) {
        super(speed);
    }

    public int getDistance(int hours) {
        return hours * speed;
    }

    public void doSomething(){

    }
}
