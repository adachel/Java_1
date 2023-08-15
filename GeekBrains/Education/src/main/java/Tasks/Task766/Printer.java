package Tasks.Task766;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Орешки
 *  Белочка собрала в лесу N шишек c орешками. Белочка очень привередливо выбирала шишки, и брала только те,
 *  в которых ровно M орешков. Также известно, что для пропитания зимой ей необходимо не менее K орешков.
 *  Определите, хватит ли на зиму орешков белочке.
 *  Входные данные
 *
 *  Первая строка входного файла INPUT.TXT содержит три натуральных числа через пробел: N, M и K (N, M ≤ 100, K ≤ 10 000).
 *  Выходные данные
 *
 *  В выходной файл OUTPUT.TXT выведите «YES» если белочке хватит орешков и «NO» в противном случае.
 */
public class Printer {
    private static String Calc(String text){
        String[] arr = text.split(" ");
        int N = Integer.parseInt(arr[0]); // кол-во шишек
        int M = Integer.parseInt(arr[1]); // кол-во орешков
        int K = Integer.parseInt(arr[2]); // нужно олешков
        String res = "";
        if (K <= (N * M)) res = "YES";
        else res = "NO";
        return res;
    }
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task766\\input.txt");
        String dataInput  = Files.readString(input);
        String res = Calc(dataInput);
        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task766\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат: " + res);
        System.out.println(res);
    }

}