using System;

namespace generics {
    public class GenericTypeReference<T> {
        private static readonly Type myclass = typeof(GenericTypeReference<>);
    }
}