package Seminars.Seminar4;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>(); // односторонняя очередь
//        queue.add(1); // добавить
//        System.out.println(queue);
//
//        Deque<Integer> deque = new ArrayDeque<>(); // двухсторонняя очередь. Может вести себя как СТЭК
//        deque.add(6);
//        System.out.println(deque);

//        int LinkedList = 0;
//        ArrayList<String> arrayList = new ArrayList<>(LinkedList); // конвертация
//        System.out.println(arrayList);

        // ArrayList - список на основе массива, есть индексы
        // LinkedList - список и очередь на основе связного списка, есть индексы
        // ArrayDeque - очередь на основе массива, нет индексов


        // Task
        // Реализовать консольное приложение, которое принимает строки и запоминает их.
        // Если введено print, то нужно вывести в консоль строки так, что последняя введеная является первой в списке
        // Если введено revert, то удаляем последнюю введную строку
        // Если введено exit, то завершаем программу
        // java
        // python
        // c#
        // print -> [c#, python, java]
        // revert
        // print -> [python, java]
        // [c#, python, java]

        Scanner scanner = new Scanner(System.in);
        Deque<String> storage = new ArrayDeque<>(); // создаем хранилище
        while (true){
            String input = scanner.nextLine();
            if ("exit".equals(input)) break;
            if ("print".equals(input)){
                System.out.println(storage);
                // Todo выводим в консоль строки так, что последняя введенная является первой в списке
            } else if ("revert".equals(input)){
                storage.pollFirst(); // удаляем последнюю введенную
                // Todo удаляем последнюю введенную строку
            } else {
                storage.addFirst(input); // добавляем в начало
                // Todo сохраняем
            }
        }
        System.out.println("Программа завершена.");

    }
}
