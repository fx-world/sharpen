package ambiguity;

public class AnotherClassUsingFieldAndMethodWithSameName {

    public void work() {
        System.out.println(new FieldAndMethodWithSameName().now);
    }

}
