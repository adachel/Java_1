package Tasks.Task942;

import HomeWork.HomeWork1.Calc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Олимпиада
 * Трое студентов, пятикурсник, третьекурсник и первокурсник, живут в одной комнате общежития и любят участвовать
 * в соревнованиях по программированию по правилам ACM. У каждого из них свой подход к решению задач.
 * Пятикурсник решает все задачи строго по порядку - сначала первую, затем вторую, и так до последней.
 * Третьекурсник решает задачи строго в обратном порядке – сначала последнюю, затем предпоследнюю, и так до первой.
 * А первокурсник сначала решает самую простую задачу, затем – самую простую из оставшихся задач, и так до самой сложной.
 * Сложность задачи определяется временем, необходимым для её решения. Для решения одной и той же задачи
 * наши студенты тратят одинаковое количество времени.
 *
 * Ваша задача – по описанию соревнований по программированию определить, кто из студентов победит. Напомним,
 * что по правилам ACM побеждает участник, за 300 минут решивший больше всего задач, а при равенстве
 * количества задач – набравший меньше штрафного времени.
 *
 * Наши студенты – очень сильные программисты, и при решении задач они не делают неправильных попыток.
 * Поэтому за задачу начисляется штраф в размере количества минут от начала соревнования до её посылки на проверку.
 * Если же и количество штрафного времени совпадает – то студент со старшего курса уступает победу студенту
 * с младшего курса.
 *
 * Входные данные
 * Первая строка входного файла INPUT.TXT содержит натуральное число N (N ≤ 10) – количество задач. Во второй строке
 * записаны через пробел N натуральных чисел – количество минут, необходимое для решения каждой задачи.
 * Время решения задачи не превосходит 300 минут.
 *
 * Выходные данные
 * В выходной файл OUTPUT.TXT выведите номер курса студента, одержавшего победу в олимпиаде.
 */
public class Printer {

    private static String Calc(String[] arrData){
        int temp = 0;
        int sum5cours = 0;
        int sum4cours = 0;
        int sum1cours = 0;

        for (int i = 0; i < arrData.length; i++){ // результат пятикурсника
            temp = temp + Integer.parseInt(arrData[i]);
            sum5cours = sum5cours + temp;
        }

        temp = 0;
        for (int i = arrData.length - 1; i >= 0; i--){ // результат третьекурсника
            temp = temp + Integer.parseInt(arrData[i]);
            sum4cours = sum4cours + temp;
        }

        temp = 0;
        Arrays.sort(arrData);
        for (int i = 0; i < arrData.length; i++){ // результат первокурсников
            temp = temp + Integer.parseInt(arrData[i]);
            sum1cours = sum1cours + temp;
        }
        String res = "";
        if (sum1cours <= sum4cours && sum1cours <= sum5cours) res = "Первокурсник";
        else if (sum4cours <= sum5cours) res = "Третьекурсник";
        else res = "Пятикурсник";

        Integer[] arrInt = {sum5cours, sum4cours, sum1cours};
        Arrays.sort(arrInt);

        return res;
    }
    public static void main(String[] args) throws IOException {
        String text = "";
        try {
            Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                    "\\Education\\src\\main\\java\\Tasks\\Task942\\input.txt"); // открыл путь
            text = Files.readString(input);
        }catch (IOException e) {e.printStackTrace();}

        String[] arr = text.split("\n");
        String n = arr[0]; // кол-во значений
        String data = arr[1];
        String[] arrData = data.split(" "); // массив значений
        String res = Calc(arrData);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task942\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output,"Победитель: " + res);
        System.out.println(res);
    }
}
