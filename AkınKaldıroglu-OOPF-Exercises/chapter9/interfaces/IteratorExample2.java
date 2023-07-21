package exercises.chapter9.interfaces;

import java.util.Collection;
import java.util.Iterator;

public class IteratorExample2 {
    public static void main(String[] args) {
        Collection coll = CollectionUtil.getSet();
        System.out.println("Elements in Collection");
        for(Object o : coll){
            System.out.println(o);
        }

        iterate(coll);
        System.out.println("--------");
        forEach(coll);

    }
    public static void iterate(Iterable iterable){
        System.out.println("\n***   iterate()   ***");
        Iterator iterator = iterable.iterator();
         while (iterator.hasNext()){
             String s = (String)iterator.next();
             System.out.println(s+ " has: "+ s.length()+ " characters.");
         }
    }
    public static void forEach(Iterable<String> iterable){
        System.out.println("***   ForEach()   ***");
        iterable.forEach(s->{
            System.out.println(s + " has: "+ s.length() + " characters.");
        });

    }
}
