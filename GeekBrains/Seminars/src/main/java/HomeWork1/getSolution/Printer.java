package HomeWork1.getSolution;
// В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут быть заменены знаком вопроса,
// например 2? + ?5 = 69. Восстановите выражение до верного равенства. Предложите хотя бы одно решение или сообщите,
// что его нет.
// Напишите класс Equation, содержащий метод getSolution, который будет считывать уравнение из файла и восстановит его
// до верного равенства. Выведите сначала строку формата "Given the equation: {выражение из файла}".
// А затем верните строку формата "Result: {цельное выражение}". Если выражение не имеет решений - верните строку "No solution".

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Equation {
    public static String getSolution(String str) {
        // Читаем выражение из файла input.txt. добавил от эталонного решения.
        String inputString = getDataFromFile(str);
        System.out.println("Given the equation: " + inputString);

        String[] words = inputString.split(" "); // далее мое решение
        String temp = ""; String res = "";
        String a = ""; String b = "";
        for (int i = 0; i < 10; i++) {
            String stri = Integer.toString(i);
            String atemp = words[0].replace('?', (char) (i + '0'));
            String btemp = words[2].replace('?', (char) (i + '0'));
            if (words[1].toCharArray()[0] == '+'){
                if (Integer.parseInt(atemp) + Integer.parseInt(btemp) == Integer.parseInt(words[4])){
                    temp = stri; a = atemp; b = btemp;}}
//            if (words[1].toCharArray()[0] == '-'){
//                if (Integer.parseInt(atemp) - Integer.parseInt(btemp) == Integer.parseInt(words[4])){
//                    temp = stri; a = atemp; b = btemp;}}
//            if (words[1].toCharArray()[0] == '*'){
//                if (Integer.parseInt(atemp) * Integer.parseInt(btemp) == Integer.parseInt(words[4])){
//                    temp = stri; a = atemp; b = btemp;}}
//            if (words[1].toCharArray()[0] == '/'){
//                if ((Double.parseDouble(atemp) / Double.parseDouble(btemp)) == Double.parseDouble(words[4])){
//                    temp = stri; a = atemp; b = btemp;}}
        }

        if (temp == ""){res = "No solution";}
        else res = String.format("Result: %s", a + " " + words[1] + " " + b + " " + words[3] + " " + words[4]);
        return  res;
    }

    public static String getDataFromFile(String path) { // из эталонного решения
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();}
        catch (Exception exception) {
            System.out.println(exception.getMessage());return "";}}
}

/*
class Equation {  // эталонное решение
    public static String getSolution(String str) {
        // Читаем выражение из файла input.txt
        String inputString = getDataFromFile(str);
        System.out.println("Given the equation: " + inputString);

        // Формируем список. Разделитель - пробел, "+" и "=" исключаем
        ArrayList<String> list = new ArrayList<>(List.of(inputString.split(" ")));
        list.remove("+");
        list.remove("=");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // Заменяем "?" в цикле от 0 до 9, сравниваем с результатом выражения
                int x = Integer.parseInt(list.get(0).replace("?", String.valueOf(i)));
                int y = Integer.parseInt(list.get(1).replace("?", String.valueOf(j)));
                if (x + y == Integer.parseInt(list.get(2))) {
                    // Решение найдено, формируем строку ответа
                    return String.format("Result: %d + %d = %d", x, y, Integer.parseInt(list.get(2)));
                }
            }
        }
        // Иначе решения нет
        return "No solution";
    }
*/

public class Printer{
    public static void main(String[] args) {
        String file = "";

        if (args.length == 0) {
            file = "D:\\Works\\IT\\Java_start\\GeekBrains\\Seminars\\src\\main\\java\\HomeWork1\\getSolution\\input.txt";
        }
        else{
            file = args[0];
        }

        Equation eq = new Equation();
        String result = eq.getSolution(file);
        System.out.println(result);
    }
}
