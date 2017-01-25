package mappings;

public class RenameParentChildMethods {

    public static class Parent {
        public void parentMethod() {
        }
    }

    public static class Child extends Parent {
        @Override
        public void parentMethod() {
            super.parentMethod();
        }

        public void childMethod() {
            parentMethod();
        }
    }

    public static void work(Parent parent) {
        parent.parentMethod();
    }

    public static void work(Child child) {
        child.parentMethod();
        child.childMethod();
    }

}
