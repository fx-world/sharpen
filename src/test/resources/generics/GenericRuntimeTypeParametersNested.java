package generics;

import java.util.List;

public class GenericRuntimeTypeParametersNested {

    public void work() {
        read(String.class, true);
    }

    public <T> List<T> read(Class<T> clazz, boolean inlineComponent) {
        return doRead(clazz, inlineComponent);
    }

    private <C> List<C> doRead(Class<C> clazz, Object inlineComponent) {
        System.out.println(clazz);
        if (clazz.hashCode() > 10) {
            System.out.println(clazz.getName());
        }
        Object o = clazz.hashCode() % 2 == 0 ? clazz : inlineComponent;
        if (o.hashCode() != 0) {
            printType(o);
        }
        return null;
    }

    private void printType(Object c) {
        System.out.println(c);
    }


}
