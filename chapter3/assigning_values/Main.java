public class Main {
    public static void main(String[] args) {
        /*int fur = (int) 5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short) (4 + 10);
        long feathers = 10(long); // DOES NOT COMPILE*/

        // float egg = 2.0 / 9; // DOES NOT COMPILE
        // int tadpole = (int)5 * 2L; // DOES NOT COMPILE
        // short frog = 3 - 2.0; // DOES NOT COMPILE

        /*int fish = 1.0; // DOES NOT COMPILE
        short bird = 1921222; // DOES NOT COMPILE
        int mammal = 9f; // DOES NOT COMPILE
        long reptile = 192301398193810323; // DOES NOT COMPILE*/

        /*int trainer = (int)1.0;
        short ticketTaker = (short)1921222; // stored as 20678
        int usher = (int)9f;
        long manager = 192301398193810323L;*/

        /*short mouse = 10;
        short hamster = 3;
        short capybara = mouse * hamster; // DOES NOT COMPILE*/

        /*short mouse = 10;
        short hamster = 3;
        short capybara = (short)(mouse * hamster);*/

        /*short mouse = 10;
        short hamster = 3;
        short capybara = (short)mouse * hamster;
        short gerbil = 1 + (short)(mouse * hamster);*/

        /*long goat = 10;
        int sheep = 5;
        sheep = sheep * goat; // DOES NOT COMPILE*/

        /*long goat = 10;
        int sheep = 5;
        sheep *= goat;
        System.out.println(((Object)sheep).getClass().getName()); // int*/

        long wolf = 5;
        long coyote = (wolf=3);
        System.out.println(wolf); // 3
        System.out.println(coyote); // 3
    }
}
