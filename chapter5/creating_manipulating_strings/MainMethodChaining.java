public class MainMethodChaining {
    public static void main(String[] args) {
        /*String start = "AniMaL    ";
        String trimmed = start.trim(); // AniMaL
        String lowercase = trimmed.toLowerCase(); // animal
        String result = lowercase.replace('a', 'A'); // AnimAl
        System.out.println(result);*/

        String result = "AniMaL    ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
    }
}
