using System.Collections;
using System.Collections.Generic;

namespace generics {
    internal abstract class StateReplicatorServerMessage {
    }

    internal class StateReplicatorFullUpdate<T> : StateReplicatorServerMessage {
        public int serverSideModCount;

        public T state;

        public StateReplicatorFullUpdate(int serverSideModCount, T state) {
            this.serverSideModCount = serverSideModCount;
            this.state = state;
        }
    }

    public class GenericInstanceOf {
        public static void test1(object o) {
            if (Sharpen.Runtime.InstanceOf(o, typeof(StateReplicatorFullUpdate<>))) {
                System.Console.Out.WriteLine("1");
            }
            System.Console.Out.WriteLine(Sharpen.Runtime.InstanceOf(o, typeof(StateReplicatorFullUpdate<>)));
            System.Console.Out.WriteLine(typeof(StateReplicatorFullUpdate<>));
            System.Console.Out.WriteLine(o is IList);
            System.Console.Out.WriteLine(o is IDictionary);
            System.Console.Out.WriteLine(Sharpen.Runtime.InstanceOf(o, typeof(HashSet<>)));
            System.Console.Out.WriteLine(Sharpen.Runtime.InstanceOf(o, typeof(List<>)));
            System.Console.Out.WriteLine(Sharpen.Runtime.IsAssignableFrom(typeof(StateReplicatorFullUpdate<>), o.GetType()));
            System.Console.Out.WriteLine(Sharpen.Runtime.IsAssignableFrom(typeof(IList), o.GetType()));
            System.Console.Out.WriteLine(Sharpen.Runtime.IsAssignableFrom(typeof(IDictionary), o.GetType()));
            System.Console.Out.WriteLine(Sharpen.Runtime.IsAssignableFrom(typeof(HashSet<>), o.GetType()));
            System.Console.Out.WriteLine(Sharpen.Runtime.IsAssignableFrom(typeof(List<>), o.GetType()));
        }

        public static void test2(StateReplicatorServerMessage o) {
            if (Sharpen.Runtime.InstanceOf(o, typeof(StateReplicatorFullUpdate<>))) {
                System.Console.Out.WriteLine("1");
            }
            System.Console.Out.WriteLine(Sharpen.Runtime.InstanceOf(o, typeof(StateReplicatorFullUpdate<>)));
            System.Console.Out.WriteLine(Sharpen.Runtime.InstanceOf(o, typeof(StateReplicatorFullUpdate<>)) ? "1" : "2");
        }
    }
}