package Seminars.Seminar3;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
//        intro();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("1", "2", "2", "2", "4", "3", "1", "4", "5", "2"));
        countAndPrint(strings);
//        removeDuplicates(strings);
        System.out.println(strings); // "1", "2", "4", "3", "5"

//        ArrayList<String> strings = new ArrayList<>(Arrays.asList("first", "1", "-2", "second", "third", "5"));
//        removeIntegers(strings);
//        System.out.println(strings); // "first", "second", "third"


    }

    /**
     * Вывести статистику повторений внутри списка
     * "1", "2", "2", "4", "3", "1", "4", "5", "2"
     * "1" -> 2
     * "2" -> 3
     * "3" -> 1
     * "4" -> 2
     * "5" -> 1
     */
    private static void countAndPrint(ArrayList<String> strings) {
        ArrayList<String> unique = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) { // [0, size)
            String element = strings.get(i);
            if (unique.contains(element)) { // индекс первого появления указанного элемента в этом списке
                continue;
            }

            int counter = 1;
            for (int j = i + 1; j < strings.size(); j++) { // [i + 1, size)
                String another = strings.get(j);
                if (element.equals(another)) { // сравнение элементов
                    counter++;
                }
            }
            System.out.println(element + " - " + counter);
            unique.add(element);
        }
    }

    /**
     * Удалить из списка убрать дубликаты
     * "1", "2", "2", "4", "3", "1", "4", "5", "2" -> "1", "2", "4", "3", "5"
     */
    private static void removeDuplicates(ArrayList<String> strings) {
        // i = 1, j = 3
        // element = "2", another = "2"
        for (int i = 0; i < strings.size(); i++) {
            String element = strings.get(i);
            for (int j = i + 1; j < strings.size(); j++) {
                String another = strings.get(j);
                if (element.equals(another)) {
                    strings.remove(j--);
//                    j--;
                }
            }
        }
    }

    /**
     * Есть список строк, в котором могут быть целые числа. Их нужно удалить.
     * "first", "1", "-2", "second", "third", "5" -> "first", "second", "third"
     */
    private static void removeIntegers(List<String> strings) {
//        strings.removeIf(it -> isInteger(it));

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (isInteger(element)) {
                iterator.remove();
            }
        }

//        for (int i = 0; i < strings.size(); i++) {
//            String element = strings.get(i);
//            if (isInteger(element)) {
//                strings.remove(i--);
//            }
//        }
    }

    private static boolean isInteger(String str) {
//        int first = 0;
//        if (str.charAt(0) == '-') {
//            if (str.length() == 1) {
//                return false;
//            }
//            first = 1;
//        }
//
//        for (int i = first; i < str.length(); i++) {
//            if (!Character.isDigit(str.charAt(i))) {
//                return false;
//            }
//        }
//        return true;

//        return str.matches("[-]{0,1}\\d+");

        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    private static void intro() {
        // jre java runtime environment
        // jdk java development kit = jre + javac + ...

//
//        int[] array1 = IntStream.rangeClosed(1, 10).toArray();
//        List<Integer> ints = IntStream.rangeClosed(1, 10).boxed().toList();
//        int[] array2 = IntStream.generate(() -> ThreadLocalRandom.current().nextInt(100))
//                .limit(100)
//                .toArray();


        // ArrayList -> List -> Collection -> Iterable
        // [1, 2, -1, 3, ..., 10, 11, ..., null] = 20

        // [[], [], [], []]
        ArrayList<Integer> arrayLists = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        // .java, .class
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);
//        arrayList.add("sfad");
//        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5));
        arrayList.add(2, -1);
        Integer o = arrayList.get(0);

//        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.remove(3); // .remove("first")

        System.out.println(arrayList); // [1, 2, 3, 5]
        System.out.println(arrayList.size()); // 4

        // Поменять местами 1 и 2 элементы
        Integer tmp = arrayList.get(0);
        // в нулевое место вставить первый arr[0] = arr[1]
        arrayList.set(0, arrayList.get(1));
        arrayList.set(1, tmp);
        System.out.println(arrayList);


        arrayList.clear();
        System.out.println(arrayList);
        Collections.sort(arrayList);


//        Integer secondElement = arrayList.get(1);
//        System.out.println(secondElement);

//        for (int i = 0; i < arrayList.size(); i++) {
//            Integer x = arrayList.get(i);
//            System.out.println(x);
//        }
//
//        Iterator<Integer> iterator = arrayList.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            System.out.println(next);
//        }


        // array[]
        // ArrayList
        // Iterator и Iterable
        //


        ArrayList<String> strings = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth"));

        Object[] array = strings.toArray();
        String[] arrayString = strings.toArray(new String[]{});
        String[] array1String = strings.toArray(String[]::new);

        System.out.println(Arrays.toString(arrayString));
        List<String> list = new ArrayList<>(Arrays.asList(arrayString));
        System.out.println(list);
        arrayString[0] = "modified";
        System.out.println(list);
        //        list.set();
//        list.get();
        list.add("sdf");
    }

//    static class Person<E> implements Iterable<String> {
//
//        private String name;
//        private int age;
//        private double salary;
//        // ...
//
//    }

}


