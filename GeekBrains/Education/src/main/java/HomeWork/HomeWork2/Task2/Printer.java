package HomeWork.HomeWork2.Task2;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) throws IOException {
        LocalDateTime now = LocalDateTime.now();
        String timeNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Path log = Path.of("log.txt");
        if (Files.notExists(log)){Files.createFile(log);}
        Files.writeString(log, "");

        boolean isSorted;
        for (int i = 0; i < mas.length; i++) {
            isSorted = true;
            for (int j = 0; j < mas.length - 1 - i; j++) {
                if (mas[j] > mas[j+1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j+1];
                    mas[j+1] = tmp;
                    isSorted = false;
                }
            }
            String str = Arrays.toString(mas);
            Files.writeString(log, timeNow + " " + str + "\n", StandardOpenOption.APPEND);
            if (isSorted) break;
        }



//        for (int i = 0; i < mas.length; i++){
//            int max = mas[0];
//            int indexMax = 0;
//            for (int j = 1; j < mas.length - i; j++){
//                if (max < mas[j]){
//                   max = mas[j];
//                   indexMax = j;
//                }
//            }
//            int temp = mas[indexMax];
//            for (int k = indexMax; k < mas.length - i - 1; k++){
//                mas[k] = mas[k + 1];
//            }
//            mas[mas.length - 1 - i] = temp;
//            String str = Arrays.toString(mas);
//            Files.writeString(log, timeNow + " " + str + "\n", StandardOpenOption.APPEND);
//        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) throws IOException {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}