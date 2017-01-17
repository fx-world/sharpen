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
        printConcreteEnum(VEnum.VALUE0);
        printConcreteEnum(VEnum.VALUE1);
        printAnyEnum(VEnum.VALUE2);
    }

    public static void printConcreteEnum(VEnum e1) {
        System.out.println(e1.ordinal() + ": " + e1.name());
    }

    public static void printAnyEnum(Enum e2) {
        System.out.println(e2.ordinal() + ": " + e2.name());
    }

}
