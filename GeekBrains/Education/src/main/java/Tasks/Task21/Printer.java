package Tasks.Task21;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Зарплата
 * В отделе работают 3 сотрудника, которые получают заработную плату в рублях. Требуется определить: на сколько зарплата
 * самого высокооплачиваемого из них отличается от самого низкооплачиваемого.
 *
 * В единственной строке входного файла INPUT.TXT записаны размеры зарплат всех сотрудников через пробел.
 * Каждая заработная плата – это натуральное число, не превышающее 10^5.
 *
 * В выходной файл OUTPUT.TXT необходимо вывести одно целое число — разницу между максимальной и минимальной зарплатой.
 */
public class Printer {
    private static Integer Calc(String text){
        int res = 0;
        text = text.replace("\t", "");
        String[] arr = text.split(" ");
        Integer[] intArr = Arrays.stream(arr).map(Integer::parseInt).toArray(Integer[]::new); // перевод массива строк в массив 'int'
        Arrays.sort(intArr);

        System.out.println(Arrays.toString(intArr));
        res = intArr[intArr.length - 1] - intArr[0];

        return res;
    }
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task21\\input.txt");
        String text = Files.readString(input);

        int res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task21\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Pазницa между максимальной и минимальной зарплатой: " + res);
        System.out.println(res);

    }
}