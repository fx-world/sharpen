package generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map;

abstract class StateReplicatorServerMessage {
}

class StateReplicatorFullUpdate<T> extends StateReplicatorServerMessage {
    public int serverSideModCount;
    public T state;

    public StateReplicatorFullUpdate(int serverSideModCount, T state) {
        this.serverSideModCount = serverSideModCount;
        this.state = state;
    }
}

public class GenericInstanceOf {

    public static void test1(Object o) {
        if (o instanceof StateReplicatorFullUpdate) {
            System.out.println("1");
        }
        System.out.println(o instanceof StateReplicatorFullUpdate);
        System.out.println(StateReplicatorFullUpdate.class);
        System.out.println(o instanceof List);
        System.out.println(o instanceof Map);
        System.out.println(o instanceof Set);
        System.out.println(o instanceof ArrayList);
        System.out.println(StateReplicatorFullUpdate.class.isAssignableFrom(o.getClass()));
        System.out.println(List.class.isAssignableFrom(o.getClass()));
        System.out.println(Map.class.isAssignableFrom(o.getClass()));
        System.out.println(Set.class.isAssignableFrom(o.getClass()));
        System.out.println(ArrayList.class.isAssignableFrom(o.getClass()));
    }

    public static void test2(StateReplicatorServerMessage o) {
        if (o instanceof StateReplicatorFullUpdate) {
            System.out.println("1");
        }
        System.out.println(o instanceof StateReplicatorFullUpdate);
        System.out.println(o instanceof StateReplicatorFullUpdate ? "1" : "2");
    }

}