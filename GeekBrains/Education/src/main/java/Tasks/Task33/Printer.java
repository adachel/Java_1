package Tasks.Task33;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Два бандита
 * Бандиты Гарри и Ларри отдыхали на природе. Решив пострелять, они выставили на бревно несколько банок из-под кока-колы
 * (не больше 10). Гарри начал простреливать банки по порядку, начиная с самой левой, Ларри — с самой правой.
 * В какой-то момент получилось так, что они одновременно прострелили одну и ту же последнюю банку. Гарри возмутился
 * и сказал, что Ларри должен ему кучу денег за то, что тот лишил его удовольствия прострелить несколько банок.
 * В ответ Ларри сказал, что Гарри должен ему еще больше денег по тем же причинам. Они стали спорить кто кому сколько
 * должен, но никто из них не помнил сколько банок было в начале, а искать простреленные банки по всей округе было неохота.
 * Каждый из них помнил только, сколько банок прострелил он сам.
 *
 * Определите по этим данным, сколько банок не прострелил Гарри и сколько банок не прострелил Ларри.
 *
 * В единственной строке входного файла INPUT.TXT записано 2 числа — количество банок, простреленных
 * Гарри и Ларри соответственно.
 *
 * В файл OUTPUT.TXT выведите 2 числа — количество банок, не простреленных Гарри и Ларри соответственно.
 */
public class Printer {
    private static List<Integer> Calc(String text){
        List<Integer> res = new ArrayList<>();
        text = text.replace("\t", "");
        String[] arr = text.split(" ");
        int garry = Integer.parseInt(arr[0]);
        int larry = Integer.parseInt(arr[1]);

        int garryEmpty = larry - 1;
        int larryEmpty = garry - 1;

        res.add(garryEmpty);
        res.add(larryEmpty);

        return res;
    }
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task33\\input.txt");
        String text = Files.readString(input);
        List<Integer> res = new ArrayList<>();
        res = Calc(text);
        int garry = res.get(0);
        int larry = res.get(1);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task33\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Гарри не прострелил: " + garry + "\n" + "Ларри не прострелил: " + larry);

        System.out.println(res);
    }
}