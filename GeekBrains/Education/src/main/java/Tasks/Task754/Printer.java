package Tasks.Task754;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Три толстяка
 * Три толстяка решили поспорить: кто из них самый тяжелый. После взвешивания оказалось, что их масса
 * соответственно M1, M2 и M3 килограмм. Считается, что масса толстяка должна быть не менее 94 и не более 727 килограмм.
 *
 * Помогите определить массу самого тяжелого из них, либо выяснить, что была допущена ошибка при взвешивании.
 *
 * Входной файл INPUT.TXT содержит три целых числа M1, M2 и M3, разделенные пробелом. Все числа целые и
 * не превосходят 10 000 по абсолютной величине.
 *
 * В выходной файл OUTPUT.TXT выведите массу самого тяжелого толстяка в случае корректного взвешивания,
 * либо слово «Error» в противном случае.
 */

public class Printer {

    private static String Calc(String text){
        text = text.replace("\t", "");
        String[] arr = text.split(" ");
        int max = 0;
        String res = "";
        for (int i = 0; i < arr.length; i++){
            if (Integer.parseInt(arr[i]) < 727 && Integer.parseInt(arr[i]) > 94) {
                if (Integer.parseInt(arr[i]) > max) {
                    max = Integer.parseInt(arr[i]);
                    res = Integer.toString(max);
                }
            }
            else {
                res = "ERROR";
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start" +
                "\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task754\\input.txt");
        String text = Files.readString(input);
        String res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task754\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат = " + res);

        System.out.println(res);
    }
}
