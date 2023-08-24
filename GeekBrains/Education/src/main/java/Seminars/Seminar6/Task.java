package Seminars.Seminar6;

import java.util.List;
import java.util.*;

/**
 * Есть коллекция чисел [1, 2, 2, 3, 4, 1, 1, 5, 10, 23]
 * Нужно посчитать кол-во уникальных элементов.
 */
public class Task {
    static int uniqueCount(Collection<Integer> ints){
        Set<Integer> setList = new HashSet<>(ints);
        System.out.println(setList);
        return setList.size();
    }
    public static void main(String[] args) {
        System.out.println(uniqueCount(List.of(1, 2, 2, 3, 4, 1, 1, 5, 10, 23)));
    }
}
