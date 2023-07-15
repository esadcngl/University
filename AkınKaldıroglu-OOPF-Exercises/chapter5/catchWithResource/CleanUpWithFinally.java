package exercises.chapter5.catchWithResource;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CleanUpWithFinally {
    private static List<Integer> list = new ArrayList<Integer>();
    private final static int SIZE = 10;

    public static void main(String[] args) {
        populateList();
       writeList();
    }

    private static void populateList() {
        for (int i = 0; i < SIZE; i++) {
            list.add((int) (10 * i * Math.random()));
        }
    }
    public static void writeList() {
        PrintWriter out = null;
        System.out.println("Entered try statement");
        try {
            out = new PrintWriter(new FileWriter("C:\\Users\\Esadcngl\\Desktop\\deneme.txt"));
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at: " + i + " = " + list.get(i));
                 if(i == 8)
                   throw new IOException("Unexpected Error");
            }
            out.close();
            out = null;
        } catch (IOException e) {
            System.out.println("Problem when writing out to the file: " + e.getMessage());
        } finally { // For clean up!
            if (out != null) {
                System.out.println("Closing PrintWriter");
                out.close();
                out = null;
            } else {
                System.out.println("PrintWriter not open");
            }
        }
    }

}



