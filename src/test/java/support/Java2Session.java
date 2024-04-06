//package support;
//
//public class Java2Session {
//    public static void main(String[] args) {
//        if(true) {
//            //this code will be executed if true
//        } else if (true) {
//            //this will be executed otherwise 1st statement
//        } else {
//            //this will be executed if none of previous conditions met
//        }
//    }
//}

package support;

import org.apache.xerces.impl.xs.SchemaSymbols;

import java.util.Scanner;

public class Java2Session {
    public static void main(String[] args) {
        int val = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a number: ");

        try {
            val = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Error occured.");
        }

        if (val == 0) {
            System.out.println("The value is 0");
        } else if (val < 0) {
            System.out.println("Val is negative");
        } else if (val > 0) {
            System.out.println("Val is positive.");
        }
    }
}