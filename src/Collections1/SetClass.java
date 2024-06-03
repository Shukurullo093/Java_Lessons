package Collections1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        // set da index bilan ishlab bo'lmaydi.
        Set<Object> set = new HashSet<>();

        set.add("Hello");
        set.add(10);
        set.add(5.2);
        set.add(false);
        System.out.println(set);
        System.out.println("-----------------");

        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Cherry");
        fruitsSet.add("Strawberry");
        fruitsSet.add("Apricot");
        fruitsSet.add("Cherry"); // Set duplicate larni qabul qilmaydi.
        System.out.println(fruitsSet);
        System.out.println(fruitsSet.size());

        System.out.println(fruitsSet.contains("Cherry"));
        System.out.println(fruitsSet.contains("Peach"));

        System.out.println(fruitsSet.isEmpty());

        System.out.println(fruitsSet.remove("Apricot"));
        System.out.println(fruitsSet);

        Set<String> vegetablesSet = new HashSet<>(Arrays.asList(
                "Tomato", "Potato", "Carrot", "Onion"));
        System.out.println(vegetablesSet);

        Set<String> union=new HashSet<>(fruitsSet);
        union.addAll(vegetablesSet);
        System.out.println(union);

        Set<String> intersection = new HashSet<>(fruitsSet);
        intersection.retainAll(vegetablesSet);
        System.out.println(intersection);
        System.out.println("---------------------");

        Set<Obj> objSet=new LinkedHashSet<>();
        objSet.add(new Obj("Shohrux", 21));
        objSet.add(new Obj("Behzod", 18));
        objSet.add(new Obj("Alisher", 19));
        objSet.add(new Obj("Sevinch", 20));
        objSet.add(new Obj("Jamshid", 21));
        System.out.println(objSet);
    }
}
