package Tasks.Task25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Больше-меньше
 * Одна из основных операций с числами – их сравнение. Мы подозреваем, что вы в совершенстве владеете этой операцией
 * и можете сравнивать любые числа, в том числе и целые. В данной задаче необходимо сравнить два целых числа.
 *
 * Входные данные
 * В двух строчках входного файла INPUT.TXT записаны числа A и B, не превосходящие по абсолютной величине 2×109.
 *
 * Выходные данные
 * Запишите в выходной файл OUTPUT.TXT один символ "<", если A < B, ">", если A > B и "=", если A=B.
 */
public class Printer {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task25\\input.txt");
        String text = Files.readString(input).replace('\r', ' ');
        String[] arr = text.split("\n");
        String res = "";

        if (Integer.parseInt(arr[0].trim()) < Integer.parseInt(arr[1].trim())) res = "<";
        else if (Integer.parseInt(arr[0]) > Integer.parseInt(arr[1])) res = ">";
        else if (Integer.parseInt(arr[0]) == Integer.parseInt(arr[1])) res = "=";

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task25\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output,"Результат: '" + res + "'");
        System.out.println(res);
    }
}
