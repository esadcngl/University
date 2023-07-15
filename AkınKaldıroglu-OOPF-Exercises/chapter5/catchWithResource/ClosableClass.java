package exercises.chapter5.catchWithResource;

import java.io.Closeable;
import java.io.IOException;

public class ClosableClass implements Closeable {
    private String name;
    private boolean isOpen;
    ClosableClass(String Name,boolean isopen){
        System.out.println("ClosableClass constructed: "+ Name);
        this.name = Name;
        isOpen = true;
        if(isopen){
            System.out.println("Throwing RuntimeException");
            throw new RuntimeException();
        }
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing Closable Class Object: "+ name );
        isOpen = false;
    }
    public void doSomething(){
        System.out.println("Doing Something.");
    }

    public boolean isItOpen(){
        return isOpen;
    }
}
