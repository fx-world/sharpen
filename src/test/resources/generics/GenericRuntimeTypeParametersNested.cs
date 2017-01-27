namespace generics {
    public class GenericRuntimeTypeParametersNested {
        public virtual void work() {
            read<string>(true);
        }

        public virtual System.Collections.Generic.IList<T> read<T>(bool inlineComponent) {
            return doRead<T>(inlineComponent);
        }

        private System.Collections.Generic.IList<C> doRead<C>(object inlineComponent) {
            System.Console.Out.WriteLine(typeof(C));
            if (typeof(C).GetHashCode() > 10) {
                System.Console.Out.WriteLine(typeof(C).FullName);
            }
            object o = typeof(C).GetHashCode() % 2 == 0 ? typeof(C) : inlineComponent;
            if (o.GetHashCode() != 0) {
                printType(o);
            }
            return null;
        }

        private void printType(object c) {
            System.Console.Out.WriteLine(c);
        }
    }
}