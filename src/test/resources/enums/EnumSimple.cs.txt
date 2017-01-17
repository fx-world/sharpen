namespace enums {
	public class EnumSimple {
		public enum VEnum {
			VALUE0,
			VALUE1,
			VALUE2,
			VALUE3,
			VALUE4
		}

		public static void work() {
			printConcreteEnum(enums.EnumSimple.VEnum.VALUE0);
			printConcreteEnum(enums.EnumSimple.VEnum.VALUE1);
			printAnyEnum(enums.EnumSimple.VEnum.VALUE2);
		}

		public static void printConcreteEnum(enums.EnumSimple.VEnum e1) {
			System.Console.Out.WriteLine((int)(e1) + ": " + e1.ToString());
		}

		public static void printAnyEnum(object e2) {
			System.Console.Out.WriteLine((int)(e2) + ": " + e2.ToString());
		}
	}
}