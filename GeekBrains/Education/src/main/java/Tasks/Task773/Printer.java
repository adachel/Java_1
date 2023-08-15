package Tasks.Task773;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Гулливер
 * Из книги Джонатана Свифта мы знаем, что тот Гулливер посетил страну «Лилипутию», где живут лилипуты, окруженные вещами,
 * животными и заводами небольшого размера. Сначала лилипуты боялись Гулливера, но позже они поняли,
 * что такое соседство приносит им большую выгоду, и они стали помогать ему. Например, лилипуты делали кровать для Гулливера
 * из своих маленьких матрацев, сшитых вместе. Лилипутам были известны размеры Гулливера. Довольно быстро они смогли просчитать
 * количество матрацев, необходимых для шитья большого матраца. Но у них постоянно возникали сложности с их небольшим ростом
 * и стеля постель, они иногда не могли сшить достаточно толстый матрац.
 * Входные данные
 *
 * Входной файл INPUT.TXT содержит два целых числа, которые разделены пробелом: K – коэффициент, отражающий во сколько раз
 * Гулливер больше лилипутов, и M – количество слоев матрацев (2 ≤ K, M ≤ 100).
 * Выходные данные
 *
 * В выходной файл OUTPUT.TXT выведите количество матрацев лилипутов, необходимых для построения матраца для Гулливера.
 */
public class Printer {
    private static Integer Calc(String text){
        int res = 0;
        text = text.replace("\t", "");
        String[] arr = text.split(" ");
        int K = Integer.parseInt(arr[0]); // коэф. во сколько раз Гул больше Лили
        int M = Integer.parseInt(arr[1]); // кол-во слоев матрацев

        res = K * K * M;

        return res;
    }
    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task773\\input.txt");
        String text = Files.readString(input);
        int res = Calc(text);
        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\Education\\src\\main\\java\\Tasks\\Task773\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Результат: " + res);
        System.out.println(res);
    }
}

