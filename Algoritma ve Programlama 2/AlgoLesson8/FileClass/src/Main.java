import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File dosya = new File("deneme.txt");
        System.out.println("Dosya var mı ? " + dosya.exists());
        System.out.println("Dosyanın uzunluğu : "+ dosya.length()+" bytes ");
        System.out.println("Dosya okunabilir mi ? : " + dosya.canRead());
        System.out.println("Dosya yazılabilir mi ? : "+ dosya.canWrite());
        System.out.println("Bir dizin mi? " + dosya.isDirectory());
        System.out.println("Bir dosya mı? " + dosya.isFile());
        System.out.println("Mutlak mı ? "+ dosya.isAbsolute());
        System.out.println("Gizli mi ? "+ dosya.isHidden());
        System.out.println("Mutlak yolu " + dosya.getAbsolutePath());
        System.out.println("Son değişiklik tarihi "+ new java.util.Date(dosya.lastModified()));
        System.out.println("Dosya yolu : " + dosya.getPath());
       FileWriter dosya2 = new FileWriter("C:\\EsoWorkspace\\deneme2.txt");
    }
}