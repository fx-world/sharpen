package enums;

public class EnumComplex {

    public enum Color {
        RED(0xFF0000),
        GREEN(0x00FF00),
        BLUE(0x0000FF),
        YELLOW(0xFFFF00),
        ;
        public final int rgb;

        public int getR() {
            return rgb & 0xFF0000;
        }

        Color(int rgb) {
            this.rgb = rgb;
        }
    }

    public static void work() {
        Color[] values = Color.values();
        for (int i = 0; i < values.length; i++) {
            printColor(values[i]);
        }
    }

    public static void printColor(Color color) {
        System.out.println(color.ordinal() + ": " + color.name() + " " + color.rgb + " " + color.getR());
    }

}
