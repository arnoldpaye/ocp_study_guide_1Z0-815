import java.util.*;

import javax.print.DocFlavor.STRING;

public class ForEachLoop {

    public void printNames(String[] names) {
        for (String name: names)
            System.out.println(name);
    }
    public static void main(String[] args) {
        /*ForEachLoop loop = new ForEachLoop();
        String[] names = {"Abbie", "Bob", "Carl"};
        loop.printNames(names);*/

        /*final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for (String name: names) {
            System.out.print(name + ", ");
        }*/

        /*List<String> values = new ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");

        for (var value : values) {
            System.out.print(value + ", ");
        }*/

        /*String names = "Lisa";
        for (String name: names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }*/

        /*String[] names = new String[3];
        for (int name: names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }*/

        /*List<String> names = new ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(name);
        }*/

        int[] values = new int[3];
        values[0] = 1;
        values[1] = Integer.valueOf(3);
        values[2] = 6;

        for (int i = 1; i < values.length; i++) {
            System.out.print(values[i] - values[i - 1] + ", ");
        }
    }
}
