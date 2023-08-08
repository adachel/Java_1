package Seminars.Seminar5;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        // HashMap - 1. Создается массив на 16(по умолчанию) элементов [null, null ... null];
        // 2. Вставляете значения hashMap.put(key, value);
        // 3. Первое - вычисляется Hash - key. Hash - это числовое значение.
        // 4. ключу в массиве ищется место. Если Hash > 16, то значение это остаток key.hash % 16.
        // 5. нашлось место - вставляется пара(массив массивов).


//        Map<Integer, String> hashMap = new HashMap<>(); // не отсортирован!
//        hashMap.put(1, "один");
//        hashMap.put(4, "четыре");
//        hashMap.put(3, "три");
//        hashMap.put(2, "два");
//        System.out.println(hashMap);

//        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet(); // делает коллекцию из 'Map'
//        Set<Integer> intergers = hashMap.keySet(); // множество ключей
//        Collection<String> value = hashMap.values(); // коллекция значений
//
//        System.out.println(entries);
//        System.out.println(intergers);
//        System.out.println(value);

//
//        Map<Integer, String> map = new HashMap<>();
//        for (int i = 1; i < 1000000; i++){
//            map.put(i, String.valueOf(i));
//        }
//        Set<Map.Entry<Integer, String>> pairs = map.entrySet();
//        int counter = 1;
//        for (Map.Entry<Integer, String> pair : pairs){
//            Integer key = pair.getKey();
//            if (key != counter){
//                System.out.println("Нарушен порядок для " + counter + " -го элемента");
//                System.out.println(key);
//                System.out.println(counter);
//                break;
//            }
//            counter++;
//        }

        /////// TreeMap
//        Map<Integer, String> treemap = new TreeMap<>(); // сбалансированное дерево.
        // Есть ограничение по ключам, должны быть сравниваемые.

        ////// LinkedHashMap
//        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // хранит ключи в последовательности добавления


        // Task 1
//        countAndPrint(List.of("1", "2", "2", "4", "3", "1", "4", "5", "2"));

        System.out.println(isIsomorph("aaaaa", "abcde"));
    }

    // Task 1
    /**
     * Вывести статистику повторений внутри списка
     * "1", "2", "2", "4", "3", "1", "4", "5", "2"
     * "1" -> 2
     * "2" -> 3
     * "3" -> 1
     * "4" -> 2
     * "5" -> 1
     */

    /*
    private static void countAndPrint(List<String> values) {
        Map<String, Integer> stats = new HashMap<>(); // создаем пустой 'Map'
        for (String value: values){ // пробегаем по элементам 'values'
            if (stats.containsKey(value)){ // если в 'stats' есть ключ, равный значению 'value'
                Integer oldValue = stats.get(value); // перееменной 'oldValue' присваиваем значение по ключу 'value'
                stats.put(value, oldValue + 1); // добавляем в 'stats' пару, где ключ - 'value' значение - индекс
            } else { // если в 'stats' нет ключа, равного значению 'value'
                stats.put(value, 1); // добавляем в 'stats' пару где ключ - 'value' значение - '1'
            }
        }
        System.out.println(stats);
    }
     */

    // Task 2
    /**
     * проверить, что две строки изоморфны
     *
     * foo, bar -> false
     * abc, abc -> true
     * abc, bce -> true
     * paper, title -> true
     * add, egg -> true
     * note, code -> true
     * abcde, aaaaa -> true
     * aaaaa, abcde -> false
     */
    private static boolean isIsomorph(String first, String second){ // my cod
        boolean res = false;
        Map<String, String> temp = new HashMap<>();

        String[] arrFirst = first.split("");
        String[] arrSecond = second.split("");
        if (arrFirst.length != arrSecond.length) res = false;
        else res = true;

        for (int i = 0; i < arrFirst.length; i++){
            if (temp.containsKey(arrFirst[i])){
                if (temp.containsValue(arrSecond[i])){res = true;}
                else {res = false; break;}
            } else temp.put(arrFirst[i], arrSecond[i]);
        }
        return res;
    }

    private static boolean isIsomorphic(String first, String second) { // prepod cod
        // int -> Integer, char -> Character, long -> Long
        Map<Character, Character> mapping = new HashMap<>();

        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        if (firstChars.length != secondChars.length) {
            return false;
        }

        for (int i = 0; i < firstChars.length; i++) {
            char firstChar = firstChars[i];   // o
            char secondChar = secondChars[i]; // r

            if (mapping.containsKey(firstChar)) {
                Character prevChar = mapping.get(firstChar); // a
                if (prevChar != secondChar) {
                    return false;
                }
            } else {
                mapping.put(firstChar, secondChar);
            }
        }
        return true;
    }

}
