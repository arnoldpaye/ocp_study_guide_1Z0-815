// import java.util.Random; // import tells us where to find Random
import java.util.*; // imports java.util.Random among other things

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // print a number 0-9
    }
}
