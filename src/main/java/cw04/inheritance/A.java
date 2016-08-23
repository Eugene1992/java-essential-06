package cw04.inheritance;

public class A {

    private A() {
    }

    String a;
    private String b;
    public final String c = "s";
    protected String d;

    void doSomething(){
        A a = new A();
    }
}
