package Tasks.Task8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Арифметика
 * В прошлом году Вася пошел в школу и научился считать. В этом году он изучил таблицу умножения и теперь умеет
 * перемножать любые числа от 1 до 10 без ошибок. Друг Петя рассказал ему про системы счисления, отличные от десятичной.
 * В частности, про двоичную, восьмеричную и даже шестнадцатеричную. Теперь Вася без труда (но уже с помощью листка и
 * ручки) может перемножать числа от 1 до 10 и в этих системах, используя перевод из нестандартной системы в десятичную
 * и обратно из десятичной. Например, если Васе нужно перемножить числа 101 и 1001 в двоичной системе, то он сначала эти
 * числа переводит в десятичное представление следующим образом:

 * (101)2=1*22+0*21+1*20=4+0+1=5

 * (1001)2=1*23+0*22+0*21+1*20=8+0+0+1=9

 * После чего перемножение чисел 5 и 9 Вася с легкостью производит в десятичной системе счисления в уме и получает число
 * 45. Далее производится перевод из десятичной системы счисления в двоичную. Для этого Вася делит число 45 на 2
 * (порядок системы счисления), запоминая остатки от деления, до тех пор пока в результате не останется число 0:

 * Ответ составляется из полученных остатков от деления путем их записи в обратном порядке. Таким образом Вася получает
 * результат: (101)2 * (1001)2 = (101101)2. Но теперь Вася изучает таблицу умножения чисел от 1 до 100 в десятичной
 * системе счисления, а поскольку запомнить такую таблицу очень сложно, то Васе придется очень долго ее зубрить.
 * Составьте для Васи программу, которая поможет ему проверять свои знания.
 *
 * Во входном файле INPUT.TXT записаны три натуральных числа A, B и C через пробел. Числа A и B ≤ 10^2, а C ≤ 10^6.
 *
 * В выходной файл нужно вывести YES в том случае, если A*B=C и вывести NO в противном случае.
 *
 * РЕШЕНИЕ ОЧЕНЬ ПРОСТОЕ. СРАВНИТЬ ПРОИЗВЕДЕНИЕ ЧИСЛА "А" И "В" С ЧИСЛОМ "С". Я ЖЕ НАЙДУ ДВОИЧНЫЕ ЧИСЛА
 * И ИЗ ДВОИЧНЫХ В ДЕСЯТИЧНЫЕ
 */

public class Printer {

    private static String Calc(String text){
        text = text.replace("\t", "");
        String res = "";
        String[] arr = text.split(" ");
        String A = arr[0];
        String B = arr[1];
        String C = arr[2];
        if (Integer.parseInt(A) * Integer.parseInt(B) == Integer.parseInt(C)) res = "YES";
        else res = "NO";
        return res;
    }

    private static String toBinary(String num){
        if (Integer.parseInt(num) == 0){return "0";}
        if (Integer.parseInt(num) == 1){return "1";}
        int temp = Integer.parseInt(num) % 2;
        return toBinary(String.valueOf(Integer.parseInt(num)/2)) + temp;
    }

    private static String Decimal(String num){
        int len = num.length() - 1;
        String[] temp = num.split("");
        Integer[] arr = Arrays.stream(temp).map(Integer::parseInt).toArray(Integer[]::new);
        double resTemp = 0;
        for (int i = 0; i < arr.length; i++){
            resTemp = resTemp + arr[i] * Math.pow(2, len - i);
        }

        return Integer.toString((int)resTemp);
    }

    public static void main(String[] args) throws IOException {
        Path input = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task8\\input.txt");
        String text = Files.readString(input);

        String res = Calc(text);

        Path output = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains" +
                "\\Education\\src\\main\\java\\Tasks\\Task8\\output.txt");
        if (Files.notExists(output)) Files.createFile(output);
        Files.writeString(output, "Решение: " + res);
        System.out.println(res);
    }

}
