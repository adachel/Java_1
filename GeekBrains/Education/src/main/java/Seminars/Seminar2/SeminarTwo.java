package Seminars.Seminar2;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class SeminarTwo {
    public static void main(String[] args) {

//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = new String("abc");
//        String s4 = new String("abc");

//        System.out.println(s1 == s2); // true
//        System.out.println(s2 == s3);
//        System.out.println(s3 == s4);
//
//        System.out.println(s2.equals(s1));
//        System.out.println(s2.equals(s3));
//        System.out.println(s3.equals(s4));

        // СТРОКИ СРАВНИВАТЬ ТОЛЬКО ЧЕРЕЗ 'equals' !!!!!!!

        // МЕТОДЫ СТРОК
        String str = "QWErtyuio";
        String temp = "tyuio";
        int length = str.length(); // длина
        String lostr = str.toLowerCase(); // в нижний регистр
        String upstr = str.toUpperCase(); // в верхний регистр
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8); // массив байт из строки в UTF_8
        char ch = str.charAt(2); // присваивает 'ch' символ строки по индексу [2]
        char[] charArray = str.toCharArray();
        boolean bool = str.contains(temp);
        // усть ли подcтроки? сравнивает две строки и выдает если нет - 'true', если есть - 'false'.

        int ind = str.indexOf(temp); // ищет с '0' индекса. совпадает выд индекс, нет - '-1'
        int ind1 = str.indexOf(temp, 4); //  ищет с '4' индекса. совпадает выд индекс, нет - '-1'
        int lastint = str.lastIndexOf(temp); // ищет с конца

//        System.out.println("".isEmpty()); // true. ищет все
//        System.out.println("".isBlank()); // true. ищет символы
//        System.out.println(" ".isEmpty()); // false - т.к. есть пробел
//        System.out.println(" ".isBlank()); // true

        String text = "qwe wer    rte  lkj";
        String[] arr = text.split(" "); // по пробелу
        String[] arr1 = text.split("\\s++"); // регулярное выражение, не учитывает кол-во пробелов
        String[] arr2 = text.split("\\s+"); // регулярное выражение, не учитывает кол-во пробелов

        String rep = text.replace(" ", "_");
        String rep1 = text.replaceAll(" ", "_");
        String rep2 = text.replaceAll("\\s+", "_");
        String rep3 = text.replaceFirst(" ", "_"); // только первое вхождение
        String rep4 = text.trim(); // удаляет пробелы в начале и конце строки.


        StringBuilder stringBuilder = new StringBuilder(); // не создает новых строк, креме результата
        stringBuilder.append("qewqwe ewrwer   tyt    poi reyerty  rty");
        stringBuilder.replace(0,5,"_a_"); // заменили пять символов ни другие
        stringBuilder.deleteCharAt(4); // удалил символ по инд '4'
        stringBuilder.insert(0, "------"); // вставили в начало '------'
        String res = stringBuilder.toString();
        System.out.println(res);


//        System.out.println(rep); // смотреть элементы
//        System.out.println(rep1); // смотреть элементы
//        System.out.println(rep2); // смотреть элементы
//        System.out.println(rep3); // смотреть элементы

//        System.out.println(Arrays.toString(arr)); // Смотреть массивы
//        System.out.println(Arrays.toString(arr1)); // Смотреть массивы
//        System.out.println(Arrays.toString(arr2)); // Смотреть массивы

    }
}
