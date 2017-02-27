namespace ambiguity {
    public class LocalVariablesWithSameName {
        public virtual void work() {
            if (true) {
                int i = 0;
            }
            if (true) {
                int i = 1;
            }
            for (int i = 0; i < 1; i++) {
            }
            int i_1 = 2;
        }
    }
}