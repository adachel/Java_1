package Tasks.Task970;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * От перестановки что-то меняется ...
 * Всем известно, что «от перестановки слагаемых сумма не изменяется». Однако, случается и так,
 * что перестановка двух чисел приводит к более интересным последствиям.
 *
 * Пусть, например, заданы три числа: a1, a2, a3. Рассмотрим равенство a1+ a2= a3. Оно может быть неверным
 * (например, если a1= 1, a2= 4, a3= 3), однако может стать верным, если поменять некоторые числа местами
 * (например, если поменять местами a2 и a3, оно обратится в равенство 1 + 3 = 4).
 *
 * Ваша задача – по заданным трем числам определить: можно ли их переставить так, чтобы сумма первых двух
 * равнялась третьему.
 *
 * Первая строка входного файла INPUT.TXT содержит три целых числа через пробел: a1, a2, a3 (−108 ≤ a1, a2, a3 ≤ 108).
 *
 * В выходной файл OUTPUT.TXT выведите слово «YES», если заданные числа можно переставить так, чтобы сумма
 * первых двух равнялась третьему. В противном случае выведите в выходной файл слово «NO».
 */
public class Printer {
    private static String Calc(String text){
        String res = "";
        text = text.replace("\t", "");
        String[] temp = text.split(" ");
        int[] arr = Arrays.stream(temp).mapToInt(Integer::parseInt).toArray();
        if (arr[0] + arr[1] == arr[2] || arr[1] + arr[2] == arr[0] || arr[2] + arr[0] == arr[1]) res = "YES";
        else res = "NO";

        return res;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task970\\input.txt");
        String text = Files.readString(input);

        String res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task970\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат: " + res);

        System.out.println(res);
    }
}
