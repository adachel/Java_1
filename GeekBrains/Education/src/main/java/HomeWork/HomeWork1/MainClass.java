package HomeWork.HomeWork1;

public class MainClass {

    private static int Factorial(int n){
        // Факториал числа 'n'
        int res = 0;
        for (int i = 1; i <= n; i++){
            res += i;
        }
        System.out.println(res);
        return res;
    }
    private static void SimpleNum(){          // простые числа, мое решение
        int res = 0;
        for (int i = 1; i <= 1000; i++){
            if (i == 1 || i == 2) {res = i;}
            else for (int j = 2; j < i; j++){
                if (i % j == 0){
                    res = 0;
                    break;
                }
                res = i;
            }
            if (res > 0) {System.out.println(res);}
        }
    }
    private static void printPrimeNums(){       // простые числа. решение gb.
        boolean isPrime;
        for(int i = 1; i < 10; i++) {
            isPrime = i == 1;
            for(int j = 2; j < 10; j++) {
                if (i >= j && i % j == 0) {
                    if(j == i) {
                        isPrime = true;
                    }
                    break;
                }
            }
            if(isPrime) System.out.println(i);
        }
    }

    private static int Calc(char op, int a, int b){
        int res = 0;
        if (op == '+') {res = a + b;}
        else if ((op == '-')) {res = a - b;}
        else if (op == '*') {res = a * b;}
        else if (op == '/') {res = a / b;}
        else System.out.println("Некорректный оператор: 'оператор'");
        return res;
    }



    public static void main(String[] args) {
//        int a = Factorial(5);
//        System.out.println(a);
//        SimpleNum();
//        printPrimeNums();
        int res = Calc('l', 36, 6);
        System.out.println(res);

    }
}
