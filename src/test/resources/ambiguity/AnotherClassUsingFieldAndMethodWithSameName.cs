namespace ambiguity {
    public class AnotherClassUsingFieldAndMethodWithSameName {
        public virtual void work() {
            System.Console.Out.WriteLine(new ambiguity.FieldAndMethodWithSameName().now__);
        }
    }
}