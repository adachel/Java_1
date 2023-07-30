package Lections.Lection3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex01_object {
    static int[] AddItem(int[] array, int item) { // коп массивов через метод 'AddItem'
        int length = array.length; // длина существующего
        int[] temp = new int[length + 1]; // создаем новый с длинной больше на 1
        System.arraycopy(array, 0, temp, 0, length); // коп из старого в новый
        temp[length] = item;  // в хвост добавляем элемент
        return temp;
    }

        static void GetType(Object obj) {System.out.println(obj.getClass().getName());}

        public static void main(String[] args) {
//        Object o = 1; // передаем 'int'
//        GetType(o); // java.lang.Integer
//        o = 1.2;   // передаем 'double'
//        GetType(o); // java.lang.Double

        // М А С С И В Ы (неизменяемый тип)
//        int[] a = new int[] { 1, 9 }; // есть массивю. Нужен массив из 3 элементов.
//        int[] b = new int[3];         // Создаем второй массив на 3 элемента
//        System.arraycopy(a, 0, b, 0, a.length); // копир из 'a' в 'b', начиная с '0', всю длину 'a'
//        for (int i : a) { System.out.printf("%d ", i);} // 1 9
//        for (int j : b) { System.out.printf("%d ", j);}
        // 0 9 0 0 0 0 0 0 0 0

            // копирование массивов через метод 'AddItem'
//            int[] a = new int[] { 0, 9 };
//            for (int i : a) { System.out.printf("%d ", i); }
//            a = AddItem(a, 2);
//            a = AddItem(a, 3);
//            for (int j : a) { System.out.printf("%d ", j); }


            // К О Л Л Е К Ц И И
            // List – пронумерованный набор элементов.
            // сюда относятся ArrayList, LinkedList (Vector, Stack – устаревшие)
//            ArrayList list = new ArrayList();
//            List list = new ArrayList(); // сырой тип, можно разные типы ложить
//            list.add(2809);
//            list.add("string line");
//            for (Object o : list) {
//                System.out.println(o);
//                // Проблема извлечения данных
//            }
//            List<Integer> list = new ArrayList<Integer>(); // указываем тип
//            list.add(1);
//            list.add(123);
//            // list.add("string line");
//            for (Object o : list) {
//                System.out.println(o);
//                // Проблема извлечения данных
//            }

            // Разные способы создания
//            ArrayList<Integer> list1 = new ArrayList<Integer>();
//            ArrayList<Integer> list2 = new ArrayList<>();
//            ArrayList<Integer> list3 = new ArrayList<>(10); // под 10 элементов
//            ArrayList<Integer> list4 = new ArrayList<>(list3);
            /*
            add(args)                   – добавляет элемент в список ( в т.ч. на нужную позицию)
            get(pos)                    – возвращает элемент из списка по указанной позиции
            indexOf(item)               – первое вхождение или -1
            lastIndexOf(item)           – последнее вхождение или -1
            remove(pos)                 – удаление элемента на указанной позиции и его возвращение
            set(int pos, T item)        – gjvtoftn значение item элементу, который находится на позиции pos
            void sort(Comparator)       – сортирует набор данных по правилу
            subList(int start, int end) – получение набора данных от позиции start до end
             */

            // ver1
//            int day = 29;
//            int month = 9;
//            int year = 1990;
//            Integer[] date = { day, month, year };
//            List<Integer> d = Arrays.asList(date);
//            System.out.println(d); // [29, 9, 1990]

            // ver2
//            StringBuilder day = new StringBuilder("28");
//            StringBuilder month = new StringBuilder("9");
//            StringBuilder year = new StringBuilder("1990");
//            StringBuilder[] date = { day, month, year }; // массив
//            List<StringBuilder> d = Arrays.asList(date); // list
//            System.out.println(d); // [29, 9, 1990]
//            date[1] = new StringBuilder("09");
//            System.out.println(d); // [29, 09, 1990]

            /*
        clear()                     – очистка списка
        toString()                  – «конвертация» списка в строку
        Arrays.asList               – преобразует массив в список
        containsAll(col)            – проверяет включение всех элементов из col
        removeAll(col)              – удаляет элементы, имеющиеся в col
        retainAll(col)              – оставляет элементы, имеющиеся в col
        toArray()                   – конвертация списка в массив Object’ов
        toArray(type array)         – конвертация списка в массив type
        List.copyOf(col)            – возвращает копию списка на основе имеющегося
        List.of(item1, item2,...)   – возвращает неизменяемый список
             */

            // И Т Е Р А Т О Р
            // Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции во время итерации
            // с четко определенной семантикой.
            //hasNext(), next(), remove()
            // ListIterator<E>
            // hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)

            List<Integer> list = List.of(1, 12, 123, 1234, 12345);
            for (int item : list) { System.out.println(item); }
            Iterator<Integer> col = list.iterator();
            while (col.hasNext()) {     // пока есть следующий элемент
                System.out.println(col.next());
//                col.next();
//                col.remove();
            }
    }
}
