package HomeWork.HomeWork2;
public class Printer {
    static String Task1(char a, char b, int n){
        // Реализовать метод, принимающий 2 символа c1 и c2 и четное число n, который возвращает строку,
        // состоящую из символов c1c2 длины n. Пример: (c1 = 'a', c2 = 'b', n = 6 => "ababab")

//        StringBuilder ab = new StringBuilder();
//        ab.append(a); ab.append(b);
//        String str = ab.toString();
//        StringBuilder temp = new StringBuilder();
//        temp.insert(0, ab);
//        String res = temp.toString();

        String ab = String.valueOf(a) + String.valueOf(b);
        String res = "";
        for (int i = 0; i < n / 2; i++){
            res += ab;
        }
        return res;
    }

    static String Palindrom(String str){
        // Реализовать метод, принимающий строку и проверяющий, является ли она палиндромом
        String[] arr = str.split("");
        String res = ""; boolean flag = true;
        int i = 0; int j = arr.length - 1;
        while (flag && i < j){
            if (arr[i].equals(arr[j])){res = "Yes"; i++; j--;}
            else {res = "No"; flag = false;}
        }
        return res;
    }

    public static void main(String[] args) {
//        String task1 = Task1('a', 'b', 6);
//        System.out.println(task1);
//
//        String task2 = Palindrom("qwertytrewq");
//        System.out.println(task2);




    }
}
