public class Main {
    public static void main(String[] args) {
        /*StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true*/

        String string = "a";
        StringBuilder builder = new StringBuilder("a");
        System.out.println(string == builder); // DOES NOT COMPILE
    }
}
