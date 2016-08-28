package cw07.override;

public class AImpl extends C implements A, B {

    static void staticMethod() {
    }

    @Override
    public void defaultMethod() {

    }

    @Override
    public void abstractMethod(int k) {

    }

    @Override
    public int abstractMethod() {
        return 0;
    }
}
