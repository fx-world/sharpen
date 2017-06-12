using System;
using System.Collections;
using System.Collections.Generic;
using nonamespace;

namespace generics {
    public class GenericTypeReference<T> {
        private static readonly Type myclass = typeof(GenericTypeReference<>);

        public static void test(object o) {
            if (o.GetType() == typeof(GenericTypeReference<>)) {
                System.Console.Out.WriteLine("1");
            }
            System.Console.Out.WriteLine(typeof(GenericTypeReference<>));
            System.Console.Out.WriteLine(typeof(IList));
            System.Console.Out.WriteLine(typeof(List<>));
            System.Console.Out.WriteLine(typeof(EnumBase));
        }
    }
}