package generics;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(o instanceof ArrayList);
    }

    public static void test2(StateReplicatorServerMessage o) {
        if (o instanceof StateReplicatorFullUpdate) {
            System.out.println("1");
        }
        System.out.println(o instanceof StateReplicatorFullUpdate);
        System.out.println(o instanceof StateReplicatorFullUpdate ? "1" : "2");
    }

}