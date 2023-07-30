package HomeWork3.Task3;
// Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//
// Integer[] arr - список целых чисел
//
// Пример
//
//arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
//analyzeNumbers(arr)
//
// // [1, 2, 3, 4, 5, 6, 7, 8, 9]
// // Minimum is 1
// // Maximum is 9
// // Average is = 5

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        int Average = 0; int temp = 0;

        for (int i = 0; i < list.size(); i++){
            temp += list.get(i);
        }
        Average = temp / list.size();
        System.out.println(list); // весь отсортированный список
        System.out.printf("Minimum is %d", list.get(0)); // минимальный элемент
        System.out.println();
        System.out.printf("Maximum is %d", list.get(list.size() - 1)); // минимальный элемент
        System.out.println();
        System.out.printf("Average is %d", Average); // среднее арифметическое
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}