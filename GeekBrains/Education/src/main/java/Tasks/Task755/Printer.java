package Tasks.Task755;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Сбор земляники
 * Маша и Миша собирали землянику. Маше удалось сорвать X ягод, а Мише – Y ягод. Поскольку ягода была очень вкусной,
 * то ребята могли какую-то часть ягод съесть. По нашим подсчетам вместе они съели Z ягод.
 *
 * Требуется определить: сколько ягод ребята собрали в результате, при этом следует проверить, не ошиблись ли мы в
 * расчетах, подсчитывая количество съеденных ягод (их не должно было получиться больше, чем сорванных ягод).
 *
 * Входной файл INPUT.TXT содержит три натуральных числа X, Y и Z, не превышающих 1000.
 * Все числа расположены в первой строке файла и разделены пробелом.
 *
 * В выходной файл OUTPUT.TXT выведите количество собранных ягод, если наши подсчеты оказались правдоподобными,
 * либо слово «Impossible» в противном случае.
 */

public class Printer {

    private static String Calc(String text){
        String[] arr = text.split(" ");
        int x = Integer.parseInt(arr[0]); // Маша
        int y = Integer.parseInt(arr[1]); // Миша
        int z = Integer.parseInt(arr[2]); // cъели вместе

        String res = "";
        if (x + y >= z) res = Integer.toString(x + y - z);
        else res = "Impossible";

        return res;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start" +
                "\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task755\\input.txt");
        String text = Files.readString(input);
        text = text.replace("\t", "");

        String res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task755\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат = " + res);

        System.out.println(res);
    }
}
