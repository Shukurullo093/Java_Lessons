public class OuterClass {
    String name;

    class InnerClass {
        public static void main(String[] args) {
            System.out.println();
        }
    }

    static class StaticNestedClass {
        public static void main(String[] args) {
            String string;
        }
    }

    public static void main(String[] args) {
        Casting_Math castingMath = new Casting_Math();

//        OuterClass outerClass = new OuterClass();
//        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();
//        System.out.println(staticNestedClass);

        outer: for(int i = 1; i < 11; i++)
        {
            System.out.println(" ");
            if(i == 10) break;
            for(int j = 1; j < 11; j++)
            {
                System.out.printf(" * ");
                if(j == i)
                    continue outer;
            }
        }
        System.out.println("Termination by break statement");
    }
}
