namespace formattings {
    public class IndentStyleEgyptianBrackets {
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
                else {
                    field2--;
                }
            }
            try {
                do {
                    field1--;
                }
                while (field1 > 10);
            }
            catch (System.Exception e) {
                System.Console.Out.WriteLine(e);
            }
            finally {
                System.Console.Out.WriteLine("done");
            }
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

        [System.Serializable]
        public sealed class MyEnum1 : nonamespace.EnumBase {
            public static readonly formattings.IndentStyleEgyptianBrackets.MyEnum1 VALUE1 = new formattings.IndentStyleEgyptianBrackets.MyEnum1(0, "VALUE1");

            public static readonly formattings.IndentStyleEgyptianBrackets.MyEnum1 VALUE2 = new formattings.IndentStyleEgyptianBrackets.MyEnum1(1, "VALUE2");

            public static readonly formattings.IndentStyleEgyptianBrackets.MyEnum1 VALUE3 = new formattings.IndentStyleEgyptianBrackets.MyEnum1(2, "VALUE3");

            private MyEnum1(int ordinal, string name)
                : base(ordinal, name) {
            }

            public static MyEnum1[] values() {
                return new MyEnum1[] { VALUE1, VALUE2, VALUE3 };
            }
        }
    }
}