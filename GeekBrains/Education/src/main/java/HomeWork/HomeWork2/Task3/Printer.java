package HomeWork.HomeWork2.Task3;
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

class Answer {
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        StringBuilder res = new StringBuilder();
        String family = ""; String less = ""; String score = ""; String text = "";

        String str = JSON.replace('{', ' ').replace('}', ' ').replace('[', ' ').replace(']', ' ');
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("\"", "");
        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i += 3){
            for (int j = i; j < i + 3; j++){
                String[] mas = arr[j].split(":");
                if (mas[0].equals("фамилия")) {family = mas[1];}
                else if (mas[0].equals("оценка")) {score = mas[1];}
                else if (mas[0].equals("предмет")) {less = mas[1];}
                text = ELEMENT1 + family + ELEMENT2 + score + ELEMENT3 + less;
            }
            res.append(text + '\n');
        }
        System.out.println(res);
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
