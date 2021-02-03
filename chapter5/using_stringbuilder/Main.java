public class Main {
    public static void main(String[] args) {
        /*String alpha = "";
        for(char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);*/

        /*StringBuilder alpha = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);*/

        /*StringBuilder sb = new StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        StringBuilder same = sb.append("+end"); // "start+middle+end"
        System.out.println(same);*/

        /*StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);*/

        /*StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);*/

        /*StringBuilder sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true*/

        /*StringBuilder sb = new StringBuilder("animals");
        sb.insert(7, "-");
        sb.insert(0, "-");
        sb.insert(4, "-");
        System.out.println(sb);*/

        /*StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 3); // sb = adef
        sb.deleteCharAt(5); // throws an exception*/

        /*StringBuilder sb = new StringBuilder("abcdef");
        sb.delete(1, 100); // sb = a
        System.out.println(sb);*/

        /*StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder);*/

        /*StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder);*/

        /*StringBuilder sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);*/

        StringBuilder sb = new StringBuilder("ABC");
        String s = sb.toString();
        System.out.println(s);
    }
}
