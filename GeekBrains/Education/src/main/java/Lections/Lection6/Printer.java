package Lections.Lection6;


import java.util.*;

public class Printer {
    public static void main(String[] args) {

//                  HashSet
//          isEmpty() – проверка на пустоту.
//          add(V) – добавление элемента в коллекцию.
//          remove(V) – удаление элемента из коллекцию.
//          contains(V) – проверка на включение элемента в коллекции.
//          clear() – удаление всех элементов коллекции.
//          size() – возвращает количество элементов коллекции.



        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item : set) System.out.println(item); // null 1 1234 123
        set.clear();
        System.out.println(set); // []


//          addAll(Coll) – объединение множеств.
//          retainAll(Coll) – пересечение множеств.
//          removeAll(Coll) – разность множеств.
/**
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); // делаем копию 'a'
        u.addAll(b); // затем 'u' объединяем с 'b'
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
*/

//          first()
//          last()
//          headSet(E)
//          tailSet(E)
//          subSet(E1, E2)

        // TreeSet
        /**
         * В основе HashMap.
         * Упорядочен по возрастанию.
         * null’ов быть не может.
         */

/*
        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
        System.out.println(a.subSet(3, 5)); // [3, 4]
 */

//        LinkedHashSet
        /**
         * В основе HashMap.
         * Помнит порядок.
         */
        /**
         * isEmpty() – проверка на пустоту.
         * add(V) – добавление элемента в коллекцию.
         * remove(V) – удаление элемента из коллекцию.
         * contains(V) – проверка на включение элемента в коллекции.
         * clear() – удаление всех элементов коллекции.
         * size() – возвращает количество элементов коллекции.
         */

        var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        a.add(28);
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]

        /**
         * Если говорят, что разработка идет с использованием ООП – это говорит о
         * том, что используются классы и экземпляры этих классов.
         * Каждый экземпляр класса определяется общим шаблоном, который
         * называется классом.
         * В рамках класса задается общая структура, на основе которой затем
         * создаются экземпляры.
         * Данные, относящиеся к классу, называются полями класса, а код для их
         * обработки — методами класса.
         */


        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3;

        System.out.println(w1); // hash-cod отличается от 'w4'
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4); // hash-cod отличается от 'w1'

        System.out.println(w1 == w4); // false
        System.out.println(w1.equals(w4)); // false

        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4)); // false







    }
}
