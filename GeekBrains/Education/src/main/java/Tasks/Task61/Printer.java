package Tasks.Task61;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Баскетбол
 * Известны результаты каждой из 4х четвертей баскетбольной встречи. Нужно определить победителя матча.
 * Побеждает команда, набравшая больше очков в течение всего матча.
 *
 * Входной файл INPUT.TXT содержит 4 строки, в каждой строке находится два целых числа a и b – итоговый счет
 * в соответствующей четверти. а – количество набранных очков за четверть первой командой, b – количество очков,
 * набранных за четверть второй командой. (0 ≤ a,b ≤ 100).
 *
 * В выходной файл OUTPUT.TXT выведите номер выигравшей команды, в случае ничьей следует вывести «DRAW».
 */
public class Printer {

    private static String Calc(String text){
        text = text.replace("\t", "").replace("\r", "");
        String[] arr = text.split("\n");
        String[] temp = new String[]{""};
        Integer sum1 = 0; Integer sum2 = 0;

        for (int i = 0; i < arr.length; i++){
            temp = arr[i].split(" ");
            sum1 = sum1 + Integer.parseInt(temp[0]);
            sum2 = sum2 + Integer.parseInt(temp[1]);
        }

        String res = "";
        if (sum1 > sum2) res = "Победитель - первая команда";
        else if (sum1 < sum2) res = "Победитель - вторая команда";
        else res = "DRAW";

        return res;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task61\\input.txt");

        String text = Files.readString(input);

        String res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task61\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, res);

        System.out.println(res);

    }
}
