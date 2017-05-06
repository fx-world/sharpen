package formattings;

import java.io.IOException;
import java.util.Arrays;

public class IndentStylePascalCasePlus {

    public int field1;
    public long field2;
    public String field3;


    public void blocks() {
        while (field1 > 0) {
            field1--;
            if (field1 % 10 == 0) {
                break;
            }
            if (field1 % 2 == 0) {
                field2 += 2;
            } else if (field1 % 3 == 0) {
                field2 += 3;
            } else if (field1 % 4 == 0) {
                if (field2 == 1) {
                    field2 += 4;
                } else if (field2 == 2) {
                    field2 += 5;
                } else {
                    field2 += 6;
                }
            } else {
                field2 += 7;
            }
        }
        for (long i = 0; i < field2; i++) {
            if (i % 100 == 0) {
                field1++;
            } else {
                field2--;
            }
        }

        try {
            do {
                field1--;
            } while (field1 > 10);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("done");
        }

        for (Integer v : Arrays.asList(1, 2, 3)) {
            System.out.println(v);

            switch (v) {
                case 1:
                    System.out.println("a");
                    break;
                case 2: {
                    System.out.println("b");
                    break;
                }
                default: {
                    System.out.println("");
                }
            }
        }

    }

    public void method1(int v) {
        field1 = v;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public void methodTryCatch1() {
        try {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        }
    }

    public void methodTryCatch2() {
        try {
            System.out.println(1);
        } catch (Exception e) {
            System.out.println(2);
        } catch (Throwable e) {
            System.out.println(3);
        }
        System.out.println(4);
    }

    private static class InnerClass {
        public long field1;
        public long field2;

        public InnerClass() {
        }

        public InnerClass(long field1, long field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        public void method1(long v) {
            field1 = v;
        }

        public void method2(long v) {
            field2 = v;
        }

    }

    public enum MyEnum1 {
        VALUE1,
        VALUE2,
        VALUE3,
    }

}