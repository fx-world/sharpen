package ambiguity;

public class FieldAndMethodWithSameNameGeneric<T> {
    public int getNow() {
        return now;
    }

    public void setNow(int now) {
        this.now = now;
    }

    public int now;

    public int now() {
        return now;
    }

    public void work() {
        System.out.println("now: " + now);
        System.out.println("now: " + this.now);
        System.out.println("now(): " + now());
        now = 100;
        this.now = 100;
    }

}
