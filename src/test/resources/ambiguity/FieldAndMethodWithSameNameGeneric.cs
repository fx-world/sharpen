namespace ambiguity {
    public class FieldAndMethodWithSameNameGeneric<T> {
        public virtual int getNow() {
            return now__;
        }

        public virtual void setNow(int now) {
            this.now__ = now;
        }

        public int now__;

        public virtual int now() {
            return now__;
        }

        public virtual void work() {
            System.Console.Out.WriteLine("now: " + now__);
            System.Console.Out.WriteLine("now: " + this.now__);
            System.Console.Out.WriteLine("now(): " + now());
            now__ = 100;
            this.now__ = 100;
        }
    }
}