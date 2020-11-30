import java.io.File;

public class Main {

    /*public static void openZoo(Number time) {
        if (time instanceof String) { // DOES NOT COMPILE

        }
    }*/

    public static void main(String[] args) {
        /*boolean monkey = true == 3; // DOES NOT COMPILE
        boolean ape = false != "Grape"; // DOES NOT COMPILE
        boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE*/

        /*File monday = new File("schedule.txt");
        File tuesday = new File("schedulte.txt");
        File wednesday = tuesday;
        System.out.println(monday == tuesday); // false
        System.out.println(tuesday == wednesday); // true*/

        /*int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
        System.out.println(gibbonNumFeet < wolfNumFeet); // true
        System.out.println(gibbonNumFeet <= wolfNumFeet); // true
        System.out.println(gibbonNumFeet >= ostrichNumFeet); // true
        System.out.println(gibbonNumFeet > ostrichNumFeet); // false*/

        /*Integer zooTime = Integer.valueOf(9);
        Number num = zooTime;
        Object obj = zooTime;*/

        /*System.out.println(null instanceof Object);
        Object noObjectHere = null;
        System.out.println(noObjectHere instanceof String);*/

        // System.out.println(null instanceof null); // DOES NOT COMPILE

        /*boolean eyesClosed = true;
        boolean breathingSlowly = true;
        
        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println(resting); // true
        System.out.println(asleep); // true
        System.out.println(awake); // false*/

        /*int hour = 10;
        boolean zooOpen = true || (hour < 4);
        System.out.println(zooOpen); // true*/

        /*int rabbit = 6;
        boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
        System.out.println(rabbit);*/

        /*int owl = 5;
        int food;
        if (owl < 2) {
            food = 3;
        } else {
            food = 4;
        }
        System.out.println(food); // 4*/

        /*int owl = 5;
        int food = owl < 2 ? 3 : 4;
        System.out.println(food); // 4*/

        int stripes = 7;
        System.out.println((stripes > 5) ? 21 : "Zebra"); // 21

        int animal = (stripes < 9) ? 3 : "Horse"; // DOES NOT COMPILE
    }
}
