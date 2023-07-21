package exercises.chapter9.interfaces;

import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        Collection coll1 = CollectionUtil.getCollection();
        System.out.println("Collection "+   coll1);
        coll1.add("twenty");
        System.out.println("Include \"twenty\": "+coll1.contains("twenty"));
        Iterator it = coll1.iterator();
//        coll1.add("fifty");
//        coll1.remove("fifty");
// This is not happening because when you write this code there are ConcurrentModificationExeption
        System.out.println("Iteratating");
          while(it.hasNext()){
              Object o = it.next();
              String s = (String) o;
              System.out.println("Element: "+ s );
              if (s.startsWith("o")){
                  it.remove();
              }
          }
        System.out.println("----------------------------");
          // but after you can add
        coll1.add("twenty one");
        System.out.println("collection: "+coll1);
        System.out.println("Iteratation after adding twenty one ");
        it = coll1.iterator();
        while(it.hasNext()){
            Object o = it.next();
            String s = (String) o;
            System.out.println("Element: "+ s );
            if (s.startsWith("o")){
                it.remove();
            }
        }

    }
}
