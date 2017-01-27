package generics;

import java.util.List;

public class GenericRuntimeTypeParametersNested {

    public void work() {
        read(String.class, true);
    }

    public <T> List<T> read(Class<T> clazz, boolean inlineComponent) {
        return doRead(clazz, inlineComponent);
    }

    private <T> List<T> doRead(Class<T> clazz, boolean inlineComponent) {
        return null;
    }


}
