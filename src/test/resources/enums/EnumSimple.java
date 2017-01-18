package enums;

public class EnumSimple {

    public enum VEnum {
        VALUE0,
        VALUE1,
        VALUE2,
        VALUE3,
        VALUE4,
    }

    public static void work() {
        for (VEnum e : VEnum.values()) {
            printConcreteEnum(e);
        }
        printAnyEnum(VEnum.VALUE2);
    }

    public static int getValue(VEnum e) {
        switch (e) {
            case VALUE0:
            case VALUE1:
                return 10;
            case VALUE2:
                return 20;
            default:
                return -1;
        }
    }

    public static void printConcreteEnum(VEnum e1) {
        System.out.println(e1.ordinal() + ": " + e1.name());
    }

    public static void printAnyEnum(Enum e2) {
        System.out.println(e2.ordinal() + ": " + e2.name());
    }

}
