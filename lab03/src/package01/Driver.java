/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package01;

/**
 *
 * @author s441004887
 */
//import java.util.TreeSet;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
        String str = "Hello,, How are you today? hello again. Where Are you going?";
        System.out.println("ORIGINAL TEXT:\t" + str);

        String[] out = str.split("\\W+");

        TreeSet<String> tree = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        for (String st : out) {
            tree.add(st);
        }

        System.out.println("Unique words:\t" + tree);
        Iterator<String> iter = tree.iterator();
        String s;
        int counter;
        while (iter.hasNext()) {
            s = iter.next();
            counter = count(s, out);

            System.out.printf("%s : %d%n", s, counter);
        }
    }

    public static int count(String key, String[] array) {
        int c = 0;
        for (String s : array) {
            if (key.equalsIgnoreCase(s)) {
                c++;
            }
        }
        return c;
    }
}
