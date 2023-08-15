package Tasks.Task195;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Эния
 * Неспокойно сейчас на стапелях шестого дока межгалактического порта планеты Торна. Всего через месяц закончится реконструкция
 * малого броненесущего корвета “Эния”. И снова этому боевому кораблю и его доблестной команде предстоят тяжелые бои за контроль
 * над плутониевыми рудниками Сибелиуса. Работа не прекращается ни на секунду, лазерные сварочные аппараты работают круглые сутки.
 * От непрерывной работы плавятся шарниры роботов-ремонтников. Но задержаться нельзя ни на секунду.
 * И вот в этой суматохе обнаруживается, что термозащитные панели корвета вновь требуют срочной обработки сульфидом тория.
 * Известно, что на обработку одного квадратного метра панели требуется 1 нанограмм сульфида.
 * Всего необходимо обработать N прямоугольных панелей размером A на B метров. Вам необходимо как можно скорее подсчитать,
 * сколько всего сульфида необходимо на обработку всех панелей “Энии”. И не забудьте, что панели требуют обработки с обеих сторон.
 *
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит 3 целых положительных числа через пробел: N (N ≤ 100), A (A ≤ 100), B (B ≤ 100)
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT нужно вывести единственное число – вес необходимого для обработки сульфида тория в нанограммах.
 */
public class Printer {

    private static Integer Calc(String text){
        int res = 0;
        text = text.replace("\t", "");
        String[] arr = text.split(" ");

        int N = Integer.parseInt(arr[0]); // кол-во панелей
        int A = Integer.parseInt(arr[1]); // длина панели
        int B = Integer.parseInt(arr[2]); // ширина панели

        res = (A * B) * 2 * N;

        return res;
    }
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task195\\input.txt");
        String text = Files.readString(input);

        Integer res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task195\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат: " + res);

        System.out.println(res);
    }
}
