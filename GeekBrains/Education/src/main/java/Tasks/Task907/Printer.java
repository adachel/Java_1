package Tasks.Task907;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Мышка
 * Однажды компьютерная мышка подумала, что стоит взять про запас еще один коврик. Чтобы никто не заметил
 * запасного коврика, мышка решила его спрятать под свой прямоугольный коврик. Пробравшись ночью на склад,
 * мышка обнаружила там только круглые коврики. Удастся ли мышке спрятать круглый коврик под прямоугольным ковриком?
 *
 * Первая строка входного файла INPUT.TXT содержит три натуральных числа через пробел: W, H и R,
 * где W и H - ширина и высота прямоугольного коврика, а R – радиус запасного коврика. Все числа не превосходят
 * значения 109.
 *
 * В выходной файл OUTPUT.TXT выведите «YES», если новый коврик можно спрятать под старым,
 * и слово «NO» ,если этого сделать нельзя.
 */

public class Printer {
    private static String Calc(String text){
        String res = "";
        text = text.replace("\t", "");
        String[] temp = text.split(" ");
        int w = Integer.parseInt(temp[0]); // ширина
        int h = Integer.parseInt(temp[1]); // высота
        int r = Integer.parseInt(temp[2]); // радиус
        if (2 * r > w || 2 * r > h) res = "NO";
        else res = "YES";

        return res;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task907\\input.txt");
        String text = Files.readString(input);

        String res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task907\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат: " + res);

        System.out.println(res);
    }
}
