package ambiguity;

public class LocalVariablesWithSameName {

    public void work() {
        if (true) {
            int i = 0;
        }
        if (true) {
            int i = 1;
        }
        for (int i = 0; i < 1; i++) {
        }
        int i = 2;
    }

}
