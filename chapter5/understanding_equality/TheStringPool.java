public class TheStringPool {
    public static void main(String[] args) {
        /*String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true*/

        /*String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z); // false*/

        /*String singleString = "hello world";
        String oneLine = "hello " + "world";
        String concat = " hello";
        concat += "world";
        System.out.println(singleString == oneLine);
        System.out.println(singleString == concat);*/

        /*String x = "Hello World";
        String y = new String("Hello World");
        System.out.println(x == y); // false*/

        /*String name = "Hello World";
        String name2 = new String("Hello World").intern();
        System.out.println(name == name2); // true*/

        String first = "rat" + 1;
        String second = "r" + "a" + "t" + "1";
        String third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());
    }
}
