package Seminars.Seminar1;

import java.util.Arrays;
import java.util.Random;

public class MainClassFromLessonOne {

    // Преподaвaтель
    private static void ex2() {
        int[] arr = {1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0};
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
        }
        for (int num : arr) { //итератор, for-each
            if (num == 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }
        System.out.printf("Max length 1: %s%n", Math.max(currentLength, maxLength));
    }

    private static void ex3() {
        Random random = new Random();
        int[] arr = new int[20];
        final int VAL = 3;

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = random.nextInt(1, 6);
        }
        System.out.println(Arrays.toString(arr));

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[right] == VAL) {
                right--;
            } else if (arr[left] == VAL) {
                arr[left] = arr[right];
                arr[right] = VAL;

                right--;
                left++;
            } else if (arr[left] != VAL) {
                left++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void My() {
        int[] list = {4, 5, 3, 2, 4, 4, 4, 5};
        int l = 0;
        int r = list.length - 1;
        int val = 5;
        while (l < r) {
            if (list[r] == val) {
                r--;
                if (list[l] != val) {
                    l++;
                }
            } else if (list[r] != val) {
                if (list[l] == val) {
                    int temp = list[l];
                    list[l] = list[r];
                    list[r] = temp;
                    r--;
                    l++;
                } else if (list[l] != val) {
                    l++;
                }
            }
        }
        System.out.println(Arrays.toString(list));
    }

    private static void Task4() {
        // Задание №4. Напишите метод, который находит самую длинную строку общего
        // префикса среди массива строк. Если общего префикса нет, вернуть пустую строку "".

        String str = "необходимо написать функцию";
        String[] words = str.split(" ");
        int minLength = Integer.MAX_VALUE;
        String pr = "";
        int i = 0;
        for (int k = 0; k < words.length; k++) {
            if (words[k].length() < minLength) minLength = words[k].length();
        }
        while (i < minLength){
            for (int j = 0; j < words.length - 1; j++){
                char temp = words[j].toCharArray()[i];
                if (words[j].toCharArray()[i] == words[j + 1].toCharArray()[i]) {temp = words[j].toCharArray()[i];}
                if (words[words.length - 1].toCharArray()[i] == temp) {pr = pr + temp;}
                i++;
            }
        }
        System.out.println(pr);
    }



    public static void main(String[] args) {

        // Задание №2. Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
        // максимальное количество подряд идущих 1.
//        int[] arr = new int[] {1, 1, 3, 1, 2, 1, 3, 3, 1, 1, 1, 2, 1, 1};
//        System.out.println(Arrays.toString(arr));
//        int summa = 0, temp = 0;
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == 1) {
//                summa += 1;
//                if (temp < summa) temp = summa;
//            }
//            if (arr[i] != 1) summa = 0;
//        }
//        System.out.println(temp);


        // Задание №3. Дан массив nums = [3,2,2,3] и число val = 3. Если в массиве есть числа, равные заданному,
        // нужно перенести эти элементы в конец массива. Таким образом, первые несколько (или все) элементов массива
        //должны быть отличны от заданного, а остальные - равны ему.
//        int val = 1;
//        for(int j = 0; j < arr.length; j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] == val) {
//                    int tep = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = tep;
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        Task4();
    }
}
