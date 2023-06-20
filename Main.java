import java.util.Random;

public class Main {
    public static void main(String[] args){
        LinkedList arr = new LinkedList();
        int n = 12;
        for (int i = 1; i < n; i++) {arr.add(new Random().nextInt(100));}

        arr.print();
        System.out.println();
        arr.revers();
        arr.print(); 
    }     
}
