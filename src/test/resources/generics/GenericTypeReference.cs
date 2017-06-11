using System;

namespace generics {
    public class GenericTypeReference<T> {
        private static readonly Type myclass = typeof(GenericTypeReference<>);

        public static void Main(object[] args) {
            object o = args[0];
            if (o.GetType() == typeof(GenericTypeReference<>)) {
                System.Console.Out.WriteLine("1");
            }
            if (Sharpen.Runtime.InstanceOf(o, typeof(GenericTypeReference<>))) {
                System.Console.Out.WriteLine("2");
            }
            if (o is string) {
                System.Console.Out.WriteLine("3");
            }
        }
    }
}