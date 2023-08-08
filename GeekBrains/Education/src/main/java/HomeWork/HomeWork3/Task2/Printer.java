package HomeWork.HomeWork3.Task2;
// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход
// один параметр: Integer[] arr - список целых чисел.
// Пример
// arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
// removeEvenNumbers(arr);
//
// // [1, 3, 5, 7, 9]
//
// arr = new Integer[]{2, 4, 6, 8};
// removeEvenNumbers(arr);
//
// // []

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        System.out.println(Arrays.toString(arr));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}


public class Printer {
    public static void main(String[] args) {

        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer ans = new Answer();
        ans.removeEvenNumbers(arr);
    }
}
