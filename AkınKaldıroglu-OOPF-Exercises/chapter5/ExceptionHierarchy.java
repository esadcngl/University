package exercises.chapter5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.nio.file.FileAlreadyExistsException;

public class ExceptionHierarchy {
    public static void main(String[] args) {

        try {
            ThrowIO();

        } catch (FileNotFoundException | SocketException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
        }

        System.out.println(" - - - - - - - - - - - - - -");

        try {
            ThrowIO();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException.getMessage());
            System.out.println("FileNotFound Catch Inside");
        } catch (SocketException socketException) {
            System.out.println(socketException.getMessage());
            System.out.println("SocketException Catch Inside");
        } catch (IOException ioException) {
            System.out.println(ioException.getMessage());
            System.out.println("IOException Inside");
        }


    }

    private static void ThrowIO() throws IOException {
        throw new IOException("IOException");
    }

    private static void ThrowFileNotFound() throws FileNotFoundException {
        throw new FileNotFoundException("File Not Found");
    }

    private static void ThrowSocket() throws SocketException {
        throw new SocketException("SocketException");
    }

}
