namespace generics {
    internal class NullTypeVariable {
        public static T f<T>() {
            return (T)default(T);
        }
    }
}