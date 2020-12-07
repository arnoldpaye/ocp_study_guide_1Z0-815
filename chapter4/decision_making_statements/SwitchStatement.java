public class SwitchStatement {

    /*final int getCookies() {
        return 4;
    }
    void feedAnimals() {
        final int bananas = 1;
        int apples;
        int numberOfAnimals = 3;
        final int cookies = getCookies();

        switch (numberOfAnimals) {
            case bananas:
            case apples: // DOES NOT COMPILES
            case getCookies(): // DOES NOT COMPILE
            case cookies: // DOES NOT COMPILE
            case 3 * 5:
        }
    }*/

    /*private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch (firstName) {
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMIPLE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id = 15;
                break;
        }
        return id;
    }*/

    public static void main(String[] args) {
        /*int dayOfWeek = 5;

        switch (dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }*/

        /*var dayOfWeek = 5;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }*/

        short size = 4;
        final int small = 15;
        final int big = 1_000_000;
        switch (size) {
            case small:
            case 1+2:
            case big: // DOES NOT COMPILE
        }
    }
}
