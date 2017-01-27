namespace enums {
    public class EnumComplex {
        [System.Serializable]
        public sealed class Color : nonamespace.EnumBase {
            public static readonly enums.EnumComplex.Color RED = new enums.EnumComplex.Color(0, "RED", unchecked((int)(0xFF0000)));

            public static readonly enums.EnumComplex.Color GREEN = new enums.EnumComplex.Color(1, "GREEN", unchecked((int)(0x00FF00)));

            public static readonly enums.EnumComplex.Color BLUE = new enums.EnumComplex.Color(2, "BLUE", unchecked((int)(0x0000FF)));

            public static readonly enums.EnumComplex.Color YELLOW = new enums.EnumComplex.Color(3, "YELLOW", unchecked((int)(0xFFFF00)));

            public readonly int rgb;

            public int getR() {
                return rgb & unchecked((int)(0xFF0000));
            }

            private Color(int ordinal, string name, int rgb)
                : base(ordinal, name) {
                this.rgb = rgb;
            }

            public static Color[] values() {
                return new Color[] { RED, GREEN, BLUE, YELLOW };
            }

            static Color() {
                RegisterValues<Color>(values());
            }
        }

        public static void work() {
            enums.EnumComplex.Color[] values = enums.EnumComplex.Color.values();
            for (int i = 0; i < values.Length; i++) {
                printColor(values[i]);
            }
        }

        public static void printColor(enums.EnumComplex.Color color) {
            System.Console.Out.WriteLine(color.ordinal() + ": " + color.name() + " " + color.rgb + " " + color.getR());
        }
    }
}