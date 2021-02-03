public class Main {
    public static void main(String[] args) {
        /*System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c
        System.out.println("c" + 1 + 2); // c12*/

        /*String s = "1";
        s += "2";
        s += 3;
        System.out.println(s);*/

        /*String string = "animals";
        System.out.println(string.length()); // 7*/

        /*String string = "animals";
        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
        System.out.println(string.charAt(7)); // thows exception*/

        /*String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1*/

        /*String string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals*/

        /*String string = "animals";
        System.out.println(string.substring(3, 3)); // empty string
        System.out.println(string.substring(3, 2)); // throw exception
        System.out.println(string.substring(3, 8)); // throw exception*/

        /*String string = "animals";
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123*/

        /*System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true*/

        /*System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false*/

        /*System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc*/

        /*System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false*/

        System.out.println("abc".strip()); // abc
        System.out.println("\t   a b c\n".strip()); // a b c
    }
}
