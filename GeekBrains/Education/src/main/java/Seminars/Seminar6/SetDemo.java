package Seminars.Seminar6;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // List - список, структура упорядоченных элементов, есть индексы
        // Set - множество, структура не обязательно упорядоченных не повторяющихся элементов
        // Map - словарь, набор пар: ключ - значение

        // Интерфейсы и реализации:
        // List -> ArrayList, LinkedList
        // Queue -> LinkedList, ArrayDeque
        // Map -> HashMap, TreeMap, LinkedHashMap
        // Set -> HashSet, TreeSet, LinkedHashSet

        // HashSet <- HashMap // HashSet работает только с ключами, HashMap - и с ключами и со значениями
        // TreeSet <- TreeMap // бинарное дерево
        // LinkedHashSet <- LinkedHashMap // упорядоченное множество

        Set<Integer> inst = new HashSet<>(); // реализации множества: HashSet, TreeSet, LinkedHashSet
        // add - добавление
        // contains - проверяет, есть ли такое значение
        // remove - удаляет элемент
    }
}
