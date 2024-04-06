package support;

public class Arrays {
//    public static void main(String[] args) {
//        String[] strings = new String[4];
//        strings[0] = "First string";
//        strings[1] = "Second string";
//        strings[2] = "Third string";
//        strings[3] = "scufita rosie";
//
//
//        Object[] objects = new Object[10];
//        objects[0] = "My string example";
//        objects[1] = 6;
//
//        System.out.println(strings[3]);
//    }
//}




//Given an array of strings: "Test", "One", "Portnov", "Tech", "100"
//Write a method that iterate through the array and print "MATCH"
// once "Portnov" is found in the array

//    public static void main(String[] args) {
//        String[] strings = new String[5];
//        strings[0] = "Test";
//        strings[1] = "One";
//        strings[2] = "Portnov";
//        strings[3] = "Tech";
//        strings[4] = "100";
//
//        for (int i=0; i < strings.length; i++) {
//            if (strings[i] == "Portnov") {
//                System.out.println("MATCH at " + i);
//            }
//        }
//
//    }
//}


//using 'while loop' print numbers from 10 to 1 (in inverse order)
    public static void main(String[] args) {
        int nr = 10;
        while (nr >= 1) {
            System.out.println(nr);
            nr--;
        }

    }
}
