namespace ambiguity {
    public class FieldAndMethodWithSameNameGeneric<T> {
        public virtual int getNow() {
            return _now;
        }

        public virtual void setNow(int now) {
            this._now = now;
        }

        public int _now;

        public virtual int now() {
            return _now;
        }

        public virtual void work() {
            System.Console.Out.WriteLine("now: " + _now);
            System.Console.Out.WriteLine("now: " + this._now);
            System.Console.Out.WriteLine("now(): " + now());
            _now = 100;
            this._now = 100;
        }
    }
}