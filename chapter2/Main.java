public class Main {
    // int num, String value;

    /*public int notValid() {
        int y = 10;
        int x;
        int reply = x + y; // DOES NOT COMPILE
        return reply;
    }*/

    public int valid() {
        int y = 10;
        int x; // x is declared here
        x = 3; // and initialized here
        int reply = x + y;
        return reply;
    }

    /*public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch); // DOES NOT COMPILE
    }*/

    public void whatTypeAmI() {
        var name = "Hello";
        var size = 7;
    }

    /*public void reassignment() {
        var number = 7;
        number = 4;
        number = "five"; // DOES NOT COMPILE
    }*/

    /*public void doesThisCompile(boolean check) {
        var question;
        question = 1;
        var answer;
        if (check) {
            answer = 2;
        } else {
            answer = 3;
        }
    }*/

    public void twoTypes() {
        int a, var b = 3; // DOES NOT COMPILE
        var n = null; // DOES NOT COMPILE
    }

    public static void main(String[] args) {
        /*var apples = (short)10;
        apples = (byte)5;
        apples = 1_000_000; // DOES NOT COMPILE*/
    }
}
