package cw07.override;

public interface A {

    void abstractMethod(int k);

    static void staticMethod() {
    }

    default void defaultMethod() {
    }
}
