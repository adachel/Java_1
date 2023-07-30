package HomeWork2.Task4.Reshenie;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.io.BufferedReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class Calculator {
    public int calculate(char op, int a, int b) {
        try (FileWriter fileWriter = new FileWriter(new File("log.txt"), true)) {
            logStep(fileWriter, "User entered the first operand = " + a);
            logStep(fileWriter, "User entered the operation = " + op);
            logStep(fileWriter, "User entered the second operand = " + b);

            switch (op) {
                case '+':
                    int sum = add(a, b);
                    logStep(fileWriter, "Result is " + sum);
                    return sum;
                case '-':
                    int diff = minus(a, b);
                    logStep(fileWriter, "Result is " + diff);
                    return diff;
                case '*':
                    int prod = mult(a, b);
                    logStep(fileWriter, "Result is " + prod);
                    return prod;
                case '/':
                    int quotient = divide(a, b);
                    logStep(fileWriter, "Result is " + quotient);
                    return quotient;
                default:
                    throw new IllegalArgumentException("Некорректный оператор: " + op);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private int divide(int a, int b) {
        if (b != 0) return a / b;
        throw new ArithmeticException("Деление на 0 недопустимо");
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private void logStep(FileWriter fileWriter, String note) throws IOException {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String formattedTime = currentTime.format(formatter);
        fileWriter.write(formattedTime + " " + note + "\n");
    }

}

public class Printer {

    private static final String LOG_FILE_PATH = "log.txt";

    public static void main(String[] args) {
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
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
