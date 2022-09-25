/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package01;

/**
 *
 * @author dell
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Driver {

    public static void main(String[] args) {
        // ArrayList to store names
        ArrayList list = new ArrayList();
        // Scanner to read user keyboard input
        Scanner scan = new Scanner(System.in);

        // adding some names to the ArrayList
        list.add("Ahmed");
        list.add("Mohamed");
        list.add("ahmed");
        list.add("Yasser");
        list.add("AHMED");

        // displaying the contents of the list
        System.out.println("Original name list: " + list);
        System.out.println("-----------------------------------------");

        boolean flag = true;
        int freq;
        Iterator iter;
        while (flag) {
            freq = 0;
            iter = list.iterator();

            System.out.print("Enter name: ");
            String value = scan.nextLine();

            if (value.equalsIgnoreCase("quit") || value.equalsIgnoreCase("exit")) {
                System.out.println("-----------------------------------------");
                System.out.println("Finishing.....");
                flag = false;

            } else {
                while (iter.hasNext()) {
//                    value.equalsIgnoreCase(((String)(iter.next())))
                    if (((String) (iter.next())).equalsIgnoreCase(value)) {
                        freq++;
                    }
                }

                System.out.println("frequency: " + freq);
                System.out.println("-----------------------------------------");
            }
        }
    }
}
