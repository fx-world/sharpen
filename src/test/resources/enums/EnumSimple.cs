namespace enums {
    public class EnumSimple {
        [System.Serializable]
        public sealed class VEnum : nonamespace.EnumBase {
            public static readonly enums.EnumSimple.VEnum VALUE0 = new enums.EnumSimple.VEnum(0, "VALUE0");

            public static readonly enums.EnumSimple.VEnum VALUE1 = new enums.EnumSimple.VEnum(1, "VALUE1");

            public static readonly enums.EnumSimple.VEnum VALUE2 = new enums.EnumSimple.VEnum(2, "VALUE2");

            public static readonly enums.EnumSimple.VEnum VALUE3 = new enums.EnumSimple.VEnum(3, "VALUE3");

            public static readonly enums.EnumSimple.VEnum VALUE4 = new enums.EnumSimple.VEnum(4, "VALUE4");

            private VEnum(int ordinal, string name)
                : base(ordinal, name) {
            }

            public static VEnum[] values() {
                return new VEnum[] { VALUE0, VALUE1, VALUE2, VALUE3, VALUE4 };
            }
        }

        public static void work() {
            foreach (enums.EnumSimple.VEnum e in enums.EnumSimple.VEnum.values()) {
                printConcreteEnum(e);
            }
            printAnyEnum(enums.EnumSimple.VEnum.VALUE2);
        }

        public static int getValue(enums.EnumSimple.VEnum e) {
            switch (e.ordinal()) {
                case 0:
                case 1: {
                    return 10;
                }

                case 2: {
                    return 20;
                }

                default: {
                    return -1;
                }
            }
        }

        public static void printConcreteEnum(enums.EnumSimple.VEnum e1) {
            System.Console.Out.WriteLine(e1.ordinal() + ": " + e1.name());
        }

        public static void printAnyEnum(nonamespace.EnumBase e2) {
            System.Console.Out.WriteLine(e2.ordinal() + ": " + e2.name());
        }
    }
}