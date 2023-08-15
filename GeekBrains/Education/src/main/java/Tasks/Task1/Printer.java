package Tasks.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * A+B
 * Требуется сложить два целых числа А и В.
 *
 * Входные данные
 * В единственной строке входного файла INPUT.TXT записаны два натуральных числа через пробел. Значения чисел не превышают 109.
 *
 * Выходные данные
 * В единственную строку выходного файла OUTPUT.TXT нужно вывести одно целое число — сумму чисел А и В.
  */
public class Printer {
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education" +
                "\\src\\main\\java\\Tasks\\Task1\\input.txt"); // отрыли путь к файлу
        String dataInput = Files.readString(input);
        String[] arr = dataInput.split(" ");
        int res = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education" +
                "\\src\\main\\java\\Tasks\\Task1\\output.txt"); // открываем путь (файла еще нет)
        if (Files.notExists(output)) Files.createFile(output); // проверяем, если файла нет, то создаем
        Files.writeString(output, Integer.toString(res) + "\n", StandardOpenOption.APPEND); // добавляет новый
                                                                                        // результат с новой строки
        System.out.println(res);
    }
}
