package Lections.Lection4;

import java.util.*;

import static java.lang.Character.isDigit;

public class Printer {
    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<Integer>(); // коллекция - связный список
//        list.add(12); // добавление

//        Queue<Integer> queue = new LinkedList<Integer>(); // коллекция - очередь
//        queue.add(765);
//        queue.add(45);
//        queue.add(98797);
//
//        int item = queue.remove(); // удалили первый элемент очереди

//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // приоритетом обладает наименьший элемент
//        pq.add(23); // четвертым
//        pq.add(11); // третьим
//        pq.add(3); // это будет стоять первым
//        pq.add(8); // это вторым
//
//        System.out.println(pq);
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());
//        System.out.println(pq.poll());

//        Deque<Integer> deque = new ArrayDeque<Integer>(); // добавление в начало и конец
//        deque.addFirst(1); // второй
//        deque.addFirst(8); // это первый
//        deque.addLast(12); // предпоследний
//        deque.addLast(2); // последний
//        System.out.println(deque);
//        deque.removeLast(); // удалить последний
//        deque.removeFirst(); // удалить первый
//        System.out.println(deque);
//
//        Stack<Integer> stack = new Stack<>(); // коллекция СТЭК
//        stack.push(1);
//        stack.push(12);
//        stack.push(123);
//        System.out.println(stack.pop()); // 123
//        System.out.println(stack.pop()); // 12
//        System.out.println(stack.pop()); // 1

        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++){
            if (isDigit(Integer.parseInt(exp[i]))){ // проверяем, тек элем является числом
                st.push(Integer.parseInt(exp[i]));  // добавляем в СТЭК, преобразовав из строки в число
            } else { // иначе если
                switch (exp[i]) {
                    case "+": // получаем какую-то операцию
                        res = st.pop() + st.pop(); // Извлекаем два элем из СТЭКА, применяем операцию
                        st.push(res); // ложим в СТЭК
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());

    }
}
