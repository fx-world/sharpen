namespace generics {
    public class GenericRuntimeTypeParametersNested {
        public virtual void work() {
            read<string>(true);
        }

        public virtual System.Collections.Generic.IList<T> read<T>(bool inlineComponent) {
            System.Type clazz = typeof(T);
            return doRead<T>(inlineComponent);
        }

        private System.Collections.Generic.IList<T> doRead<T>(bool inlineComponent) {
            System.Type clazz = typeof(T);
            return null;
        }
    }
}