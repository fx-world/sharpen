namespace mappings {
    public class RenameParentChildMethods {
        public class Parent {
            public virtual void parentMethod2() {
            }
        }

        public class Child : mappings.RenameParentChildMethods.Parent {
            public override void parentMethod2() {
                base.parentMethod2();
            }

            public virtual void childMethod2() {
                parentMethod2();
            }
        }

        public static void work(mappings.RenameParentChildMethods.Parent parent) {
            parent.parentMethod2();
        }

        public static void work(mappings.RenameParentChildMethods.Child child) {
            child.parentMethod2();
            child.childMethod2();
        }
    }
}