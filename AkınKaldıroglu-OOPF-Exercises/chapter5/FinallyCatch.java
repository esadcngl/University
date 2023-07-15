package exercises.chapter5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FinallyCatch {
    public static void main(String[] args) {
        try {
            trySomething();
            System.out.println("in main()");
        }catch (IOException e ){
            System.out.println("In Catch()!");
            System.out.println(e.getMessage());
        }


    }

    public static void trySomething() throws IOException {
        System.out.println("in trySomething()");
        InputStream is = null;
        try {
            System.out.println("In Try");
            is = new FileInputStream(new File("Users\\Esadcngl\\Desktop\\deneme.txt"));
            is.close();
        } finally {
            System.out.println("In Finally!");
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
