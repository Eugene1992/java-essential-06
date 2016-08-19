package cw5.singleton;


public class Single {
    private static Single instance = new Single("Some title");

    private String title;

    public static Single getInstance() {
        return instance;
    }

    private Single(String title) {
        this.title = title;
    }
}
