package Tasks.Task92;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Журавлики
 * Петя, Катя и Сережа делают из бумаги журавликов. Вместе они сделали S журавликов. Сколько журавликов сделал
 * каждый ребенок, если известно, что Петя и Сережа сделали одинаковое количество журавликов, а Катя сделала
 * в два раза больше журавликов, чем Петя и Сережа вместе?
 *
 * В единственной строке входного файла INPUT.TXT записано одно натуральное число S – общее количество
 * сделанных журавликов (S < 106).
 *
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести три числа, разделенных
 * пробелами – количество журавликов, которые сделал каждый ребенок (Петя, Катя и Сережа).
 */
public class Printer {

    private static String Calc(String text){
        String res = "";
        String temp = "";

        if (Integer.parseInt(text) % 2 != 0) res = "Кто-то не доделал журавлика!";
        for (int i = 1; i < Integer.parseInt(text); i++) {
            if (i + i + (i + i)* 2 == Integer.parseInt(text)) temp = Integer.toString(i);
        }

        res = temp + " " + temp + " " + Integer.toString(2 * (Integer.parseInt(temp) + Integer.parseInt(temp)));
        return res;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task92\\input.txt");
        String text = Files.readString(input);
        String temp = Calc(text);
        String[] arr = temp.split(" ");
        String res = "Петя сделал = " + arr[0] + "\n" + "Катя сделала = " + arr[2] + "\n" + "Сережа сделал = " + arr[1];
        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task92\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, res);
        System.out.println(res);
    }
}
