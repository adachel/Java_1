package HomeWork2.Task4;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// Возьмите код от калькулятора с прошлого урока. К этому калькулятору нужно добавить логирование.
// Логи запишите в файл log.txtв формате:
// "гггг-мм-дд чч:мм User entered the first operand = {первое число}"
// "гггг-мм-дд чч:мм User entered the operation = {оператор}"
// "гггг-мм-дд чч:мм User entered the second operand = {второе число}"
// "гггг-мм-дд чч:мм Result is {результат}"


class Calculator {
    public int calculate(char op, int a, int b) throws IOException {
        String aStr = String.format("User entered the first operand = %d",  a);
        String bStr = String.format("User entered the second operand = %d",  b);
        String opStr = String.format("User entered the operation = %s", String.valueOf(op));

        LocalDateTime now = LocalDateTime.now();
        String timeNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        Path log = Path.of("log.txt");
        if (Files.notExists(log)){Files.createFile(log);}
        Files.writeString(log, "");


        int res = 0;
        if (op == '+') {
            res = a + b;
        } else if ((op == '-')) {
            res = a - b;
        } else if (op == '*') {
            res = a * b;
        } else if (op == '/') {
            res = a / b;
        } else System.out.println("Некорректный оператор: 'оператор'");
        String resStr = String.format("Result is %d",  res);

        Files.writeString(log, timeNow + " " + aStr + "\n", StandardOpenOption.APPEND);
        Files.writeString(log, timeNow + " " + opStr + '\n', StandardOpenOption.APPEND);
        Files.writeString(log, timeNow + " " + bStr + "\n", StandardOpenOption.APPEND);
        Files.writeString(log, timeNow + " " + resStr + "\n", StandardOpenOption.APPEND);
        return res;
    }
}



// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) throws IOException {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        clearLogFile();
        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println(result);

        try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void clearLogFile() {
        File logFile = new File(LOG_FILE_PATH);
        if (logFile.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(logFile, false);
                fileWriter.write("");
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}