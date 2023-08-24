package HomeWork.HomeWork6_Final;

public class elevatorMain {
    public static void main(String[] args) {
        Elevator lift1 = new Elevator(10);
        lift1.move(5);

        Elevator lift2 = new Elevator(2, 7);
//        lift2.move(4);

        System.out.println(lift1);
        System.out.println(lift2);
    }
}
