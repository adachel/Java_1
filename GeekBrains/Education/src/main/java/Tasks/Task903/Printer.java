package Tasks.Task903;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * Бисер
 * В шкатулке хранится разноцветный бисер (или бусины). Все бусины имеют одинаковую форму, размер и вес.
 * Бусины могут быть одного из N различных цветов. В шкатулке много бусин каждого цвета.
 *
 * Требуется определить минимальное число бусин, которые можно не глядя вытащить из шкатулки так,
 * чтобы среди них гарантированно были две бусины одного цвета.
 *
 * Входные данные
 * Входной файл INPUT.TXT содержит одно натуральное число N - количество цветов бусин (1 ≤ N ≤ 109).
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите ответ на поставленную задачу.
 */
public class Printer {
    public static void main(String[] args) throws IOException {

        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task903\\input.txt"); // открыли путь
        String dataInput = Files.readString(input); // прочитали из файла

        int res = Integer.parseInt(dataInput) + 1; // на одну бусину больше

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task903\\output.txt"); // открыли путь (файла еще нет)
        if (Files.notExists(output)) Files.createFile(output); // если файла нет, то создаем
        Files.writeString(output, "Минимальное число бусин, которые можно не глядя вытащить из шкатулки так, " +
                "чтобы среди них гарантированно \n" + " * были две бусины одного цвета: " + Integer.toString(res)
                + "\n", StandardOpenOption.APPEND); // результат дописываем с новой строки

        System.out.println(res);
    }
}
