package HomeWork.HomeWork2.Task1;

class Answer {
    // Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации
    // приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.
    // Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
    // String QUERY - начало SQL-запроса; String PARAMS - JSON с параметрами.
    // Пример: {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
    // Получить: "select * from students where name='Ivanov' and country='Russia' and city='Moscow'"
    /*
    Ожидаемый ответ:

    select * from students where name='Ivanov' and country='Russia' and city='Moscow'

    Ваш ответ:

    select * from students where name='Ivanov' and country='Russia' and city='Moscow' and age='null'


    Ожидаемый ответ:

    select * from students1111 where name='Andron' and country='Russia' and city='Moscow'

    Ваш ответ:

    select * from students1111 where name='Andron' and country='Russia' and city='Moscow' and age='null'

     */

    public static StringBuilder answer(String QUERY, String PARAMS){
        StringBuilder res = new StringBuilder();
        String text0 = ""; String text1 = "";
        String str = PARAMS.replace('{', ' ').replace('}', ' ');
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("\"", "");
        String[] arr = str.split(",");

        for (int i = 0; i < arr.length; i++){
            String[] temp = arr[i].split(":");
            if (temp[1].equals("null")){break;}
            else {
                text0 = " and " + temp[0] + "=";
                text1 = "'" + temp[1] + "'";}
            res.append(text0 + text1);
        }
        res.replace(0,5,"");
        res.insert(0, QUERY);

        return res;
    }
}
public class Printer {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
