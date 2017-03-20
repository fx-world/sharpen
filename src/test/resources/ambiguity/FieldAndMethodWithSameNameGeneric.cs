namespace ambiguity {
    public class FieldAndMethodWithSameNameGeneric<T> {
        public virtual int getNow() {
            return __now;
        }

        public virtual void setNow(int now) {
            this.__now = now;
        }

        public int __now;

        public virtual int now() {
            return __now;
        }

        public virtual void work() {
            System.Console.Out.WriteLine("now: " + __now);
            System.Console.Out.WriteLine("now: " + this.__now);
            System.Console.Out.WriteLine("now(): " + now());
            __now = 100;
            this.__now = 100;
        }
    }
}