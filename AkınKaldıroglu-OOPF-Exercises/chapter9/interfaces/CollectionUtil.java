package exercises.chapter9.interfaces;

import java.util.*;

public class CollectionUtil {

    private static Set<String> set;

    static {
        set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
    }

    public static Collection<String> getCollection() {
        return set;
    }

    public static Set getEmptySet() {
        return new TreeSet();
    }

    public static void listElements(Collection coll) {
        System.out.println("\n******      Elements  in  the  Collection      ******");
        Iterator i = coll.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        System.out.println("****************************************************\n");
    }

    public static void listElements(List list) {
        System.out.println("\n******      Elements  in  the  List      ******");
        ListIterator i = list.listIterator();
        while (i.hasNext())
            System.out.println(i.nextIndex() + ": " + i.next());

        System.out.println("****************************************************\n");
    }

    public static void listElements(Map<Object, Object> map) {
        System.out.println("\n******      Elements  in  the  Map      ******");
        Set<Object> keys = map.keySet();
        Iterator<Object> i = keys.iterator();
        while (i.hasNext()) {
            Object key = i.next();
            Object value = map.get(key);
            System.out.println(key + " - " + value);
        }
        System.out.println("****************************************************\n");
    }

    public static Set<String> getSet() {
        return (Set<String>) getCollection();
    }

    public static List<String> getStringList() {
        return new ArrayList<String>(getSet());
    }

    public static Map<String, Integer> getMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("five", 5);
        map.put("eleven", 11);
        map.put("nineteen", 19);
        return map;
    }
}

