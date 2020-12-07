public class ForLoop {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
        System.out.println(i); // DOES NOT COMPILE*/

        /*for (var counter = 5; counter > 0; counter--) {
            System.out.println(counter + " ");
        }*/
        /*for (var counter = 4; counter >= 0; counter--) {
            System.out.println(counter + " ");
        }*/

        /*for ( ; ; )
            System.out.println("Hello World");*/

        /*int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");*/

        /*int x = 0;
        for (int x = 4; x < 5; x++) { // DOES NOT COMPILE
            System.out.println(x + " ");
        }*/

        /*int x = 0;
        for (long y = 0, int z = 4; x < 5; x++) { // DOES NOT COMPILE
            System.out.println(y + " ");
        }*/

        /*for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x); // DOES NOT COMPILE*/

        for (int i = 0; i < 10; i++)
            i = 0;

        for (int j = 1; j < 10; j ++)
            j--;

        for (int k = 0; k < 10; )
            k++;
    }
}
