package Lections.Lection5;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
//        Map<Integer, String> db = new HashMap<>(); // <тип для ключа, тип для значения>
//        db.put(1, "один"); System.out.println(db); // метод добавления, где '1' это ключ, 'один' - значение
//        db.putIfAbsent(1,"qwerty"); System.out.println(db); // проверяет, если такого ключа нет, тогда добавляет
//        db.put(2, "два"); System.out.println(db);
//        db.put(3, "три"); System.out.println(db);
//        db.put(null, "!null"); System.out.println(db);

        /*
        put(K,V) – добавить пару если или изменить значение,если ключ имеется.
        putIfAbsent(K,V) – произвести добавление если ключ не найден.
        get(K) - получение значения по указанному ключу.
        remove(K) – удаляет пару по указанному ключу.
        containsValue(V) – проверка наличия значения.
        containsKey(V) – проверка наличия ключа.
        keySet() – возвращает множество ключей.
        values() – возвращает набор значений.
         */

//        System.out.println(db.keySet()); // все ключи
//        System.out.println(db.values()); // все значения
//
//        for (var item : db.entrySet()) {
//            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//        }

        ////////////// Tree Map
        /*
        put(K,V) - добавить пару;
        get(K)  - получить значение по ключу;
        remove(K) - удалить пару по ключу;
        descendingKeySet() - получить ключи;
        descendingMap() -
        tailMap() - показать значение больше чем;
        headMap() - показать меньше чем;
        lastEntry() -
        firstEntry() -
         */

//        TreeMap<Integer,String> tMap = new TreeMap<>();
//        tMap.put(1,"один"); System.out.println(tMap);
//        tMap.put(6,"шесть"); System.out.println(tMap);
//        tMap.put(4,"четыре"); System.out.println(tMap);
//        tMap.put(3,"три"); System.out.println(tMap);
//        tMap.put(2,"два"); System.out.println(tMap);
//
//        String a = tMap.get(6); // значение по ключу
//        tMap.remove(6); // удаление по ключу
//        System.out.println(tMap.descendingKeySet()); // значение ключей
//        System.out.println(tMap.descendingMap()); // вывод всего tMap
//        System.out.println(tMap.tailMap(2)); // все пары с ключами >= '2'
//        System.out.println(tMap.headMap(3)); // все пары с ключами < '3'
//        System.out.println(tMap.lastEntry()); // пара с наибольшим ключем
//        System.out.println(tMap.firstEntry()); // пара с наименьшим ключем


        ////////////// LinkedHashMap
        Map<Integer,String> linkmap = new LinkedHashMap<>(); // можем хранить элементы по порядку их добавления
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap);


        /////////////// HashTable
        Map<Integer,String> table = new Hashtable<>(); // не знает 'null'
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}





    }
}
