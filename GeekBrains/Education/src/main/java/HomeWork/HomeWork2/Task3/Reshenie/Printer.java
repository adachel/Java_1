package HomeWork.HomeWork2.Task3.Reshenie;

class Answer {
    public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
        StringBuilder sb = new StringBuilder();
        String newJSON = JSON.replaceAll("\\{", "").replaceAll("\\}", "")
                .replaceAll("\"", "").replace('[', ' ').replace(']', ' ');
        String[] parts = newJSON.split(",");
        for (String part : parts){
            String[] params = part.split(":");
            if("фамилия".equals(params[0].trim())) {
                sb = new StringBuilder(ELEMENT1).append(params[1]);
            }
            else if("оценка".equals(params[0].trim())) sb.append(ELEMENT2).append(params[1]);
            else if("предмет".equals(params[0].trim())) {
                sb.append(ELEMENT3).append(params[1]);
                System.out.println(sb);
            }
        }
    }
}


public class Printer{
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
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
