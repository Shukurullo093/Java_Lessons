package Collections1;

import java.util.*;

public class ListClass {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(10);
        list.add(10.2);
        list.add(true);
        System.out.println(list);

        List<String> nameList = new ArrayList<>();
        nameList.add("John");   // 0
        nameList.add("Bob");    // 1
        nameList.add("Tom");    // 2
        nameList.add("George"); // 3
        System.out.println(nameList);

        nameList.add(2, "Lee");
        System.out.println(nameList);

        nameList.set(3, "Jackie");
        System.out.println(nameList);

        nameList.addAll(List.of(new String[]{"Bruce", "Zoe"}));
        System.out.println(nameList);

        System.out.println(nameList.get(2));
        System.out.println(nameList.getFirst());
        System.out.println(nameList.getLast());

        System.out.println(nameList.isEmpty());

        nameList.add(5, "Bob");
        System.out.println(nameList.indexOf("Bob"));
        System.out.println(nameList.lastIndexOf("Bob"));

        Object[] nameListArray = nameList.toArray();
        System.out.println(Arrays.toString(nameListArray));

        System.out.println(nameList.contains("Jackie"));

        System.out.println(nameList.remove("Bruce"));
        System.out.println(nameList.remove(5));
        System.out.println(nameList);

        nameList.sort(String::compareTo);
        System.out.println(nameList);

        System.out.println(nameList.size());

        System.out.println("------------------");

        List<Obj> objList = new ArrayList<>();

        objList.add(new Obj("Tohir", 21));
        objList.add(new Obj("Abdulla", 18));
        objList.add(new Obj("Sevinch", 22));
        objList.add(new Obj("Diyora", 22));
        objList.add(new Obj("Husan", 23));

        objList.sort(Comparator.comparing(o -> o.name));
        objList.forEach(obj -> System.out.println(
                obj.name
                        .concat(" ")
                        .concat(String.valueOf(obj.age))
                        .concat(" yoshda")));

        System.out.println();
        objList.sort(Comparator.comparing(o -> o.age));
        objList.forEach(obj -> System.out.println(
                obj.name
                        .concat(" ")
                        .concat(String.valueOf(obj.age))
                        .concat(" yoshda")));

        for (Obj obj : objList) {
            System.out.println(obj.name + " " + obj.age);
        }
    }
}
