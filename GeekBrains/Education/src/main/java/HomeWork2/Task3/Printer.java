package HomeWork2.Task3;
// Внутри класса Answer напишите метод answer, который распарсит json и, используя StringBuilder,
// создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// На вход метода answer подаются аргументы:
// String JSON
// String ELEMENT1
// String ELEMENT2
// String ELEMENT3
// Пример:
// JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
//    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
//    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
//ELEMENT1 = "Студент ";
//ELEMENT2 = " получил ";
//ELEMENT3 = " по предмету ";
//
//// Студент Иванов получил 5 по предмету Математика
//// Студент Петрова получил 4 по предмету Информатика
//// Студент Краснов получил 5 по предмету Физика

import java.util.Arrays;

class Answer {
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        StringBuilder res = new StringBuilder();

        String str = JSON.replace('{', ' ').replace('}', ' ').replace('[', ' ').replace(']', ' ');
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("\"", "");

        System.out.println(str);




        return  res;
    }
}
public class Printer {
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            ELEMENT1 = "Студент ";
            ELEMENT2 = " получил ";
            ELEMENT3 = " по предмету ";
        }
        else{
            JSON = args[0];
            ELEMENT1 = args[1];
            ELEMENT2 = args[2];
            ELEMENT3 = args[3];
        }

        Answer ans = new Answer();
        ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
    }
}
