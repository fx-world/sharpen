namespace formattings {
	public class IntentStyleEgyptianBrackets {
		public int field1;

		public long field2;

		public string field3;

		public virtual void blocks() {
			while (field1 > 0) {
				field1--;
				if (field1 % 10 == 0) {
					break;
				}
			}
			for (long i = 0; i < field2; i++) {
				if (i % 100 == 0) {
					field1++;
				}
			}
			do {
				field1--;
			}
			while (field1 > 10);
			foreach (int v in java.util.Arrays.asList(1, 2, 3)) {
				System.Console.Out.WriteLine(v);
				switch (v) {
					case 1: {
						System.Console.Out.WriteLine("a");
						break;
					}

					case 2: {
						System.Console.Out.WriteLine("b");
						break;
					}

					default: {
						System.Console.Out.WriteLine(string.Empty);
						break;
					}
				}
			}
		}

		public virtual void method1(int v) {
			field1 = v;
		}

		public virtual string getField3() {
			return field3;
		}

		public virtual void setField3(string field3) {
			this.field3 = field3;
		}

		private class InnerClass {
			public long field1;

			public long field2;

			public InnerClass() {
			}

			public InnerClass(long field1, long field2) {
				this.field1 = field1;
				this.field2 = field2;
			}

			public virtual void method1(long v) {
				field1 = v;
			}

			public virtual void method2(long v) {
				field2 = v;
			}
		}

		public enum MyEnum1 {
			VALUE1,
			VALUE2,
			VALUE3
		}
	}
}