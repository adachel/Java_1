package Tasks.Task149;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Разворот
 * Дано натуральное число N и последовательность из N элементов. Требуется вывести эту последовательность
 * в обратном порядке.
 * В первой строке входного файла INPUT.TXT записано натуральное число N (N ≤ 103). Во второй строке через
 * пробел идут N целых чисел, по модулю не превосходящих 10^3 - элементы последовательности.
 * В выходной файл OUTPUT.TXT выведите заданную последовательность в обратном порядке.
 */
public class Printer {
    private static StringBuilder Calc(String text){
        text = text.replace("\t", "");
        String[] temp = text.split("\n");
        String[] arr = temp[1].split(" ");
        StringBuilder newString = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--){
            newString.append(arr[i]).append(" ");
        }

        return newString;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task149\\input.txt");
        String text = Files.readString(input);

        String res = String.valueOf(Calc(text));

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task149\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат: " + res);

        System.out.println(res);
    }
}
