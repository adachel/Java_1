package Tasks.Task539;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Торт
 * На свой день рождения Петя купил красивый и вкусный торт, который имел идеально круглую форму.
 * Петя не знал, сколько гостей придет на его день рождения, поэтому вынужден был разработать алгоритм,
 * согласно которому он сможет быстро разрезать торт на N равных частей. Следует учесть, что разрезы торта
 * можно производить как по радиусу, так и по диаметру.
 *
 * Помогите Пете решить эту задачу, определив наименьшее число разрезов торта по заданному числу гостей.
 *
 * Входной файл INPUT.TXT содержит натуральное число N – число гостей, включая самого виновника торжества (N ≤ 1000).
 *
 * В выходной файл OUTPUT.TXT выведите минимально возможное число разрезов торта.
 */
public class Printer {

    private static String Calc(String text){
        String res = "";
        if (Integer.parseInt(text) % 2 == 0) res = Integer.toString(Integer.parseInt(text) / 2);
        else res = text;
        return res;
    }
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start" +
                "\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task539\\input.txt");
        String text = Files.readString(input);
        String res = Calc(text);
        Path output = Path.of("D:\\Works\\IT\\Java_start" +
                "\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task539\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат = " + res);
        System.out.println(res);
    }
}
