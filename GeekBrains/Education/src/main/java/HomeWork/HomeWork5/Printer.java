package HomeWork.HomeWork5;

import java.util.*;

// /**
//     * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
//     * Регистр слова не имеет значения. Формат вывода произвольный.
//     * Программа-минимум:
//     * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
//     * 2. Точки и запятые не должны входить в статистику.
//     *
//     * Доп. задание
//     * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
//     *
//     * Пример:
//     *
//     * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB.
//     * Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.
//     *
//     * 1 -> [и, в]
//     * 2 -> [он, из, gb, не]
//     * 3 -> [мой, для]
//     * 4 -> [слов, того, себе]
//     * 5 -> [текст, нужен, чтобы, несет, набор]
//     * ...
//     */
public class Printer {

    static void printStatsVar1(String text) {   // C дефисами
        String cleanText = text.replace('.', ' ').replace(',', ' ')
                .replace('"', ' ').toLowerCase(); // очистка от символов
        String[] arr = cleanText.split("\s+"); // массив строк

        Map<Integer, Set<String>> stats = new TreeMap<>();

        for (int i = 0; i < arr.length; i++){
            Set<String> setList = new LinkedHashSet<>();
            int len = arr[i].length();
            for (String word: arr){
                if (len == word.length()){
                    setList.add(word);
                    stats.put(len, setList);
                }
            }
        }

        for (var item : stats.entrySet()) {
            System.out.printf("%d-> %s\n", item.getKey(), item.getValue());
        }

    }


    static void printStatsVar2(String text) {   // без дефисов
        String cleanText = text.replace('.', ' ').replace(',', ' ')
                .replace('"', ' ').toLowerCase(); // очистка от символов
        String[] arr = cleanText.split("\s+"); // массив строк

        List<String> temp = new ArrayList<>();

        for (String word: arr){
            if (word.contains("-")){
                word = word.replace('-', ' ').replaceAll("\\s+", "");
            }
            temp.add(word);
        }

        Map<Integer, Set<String>> stats = new TreeMap<>();
        for (int i = 0; i < temp.size(); i++){
            Set<String> setList = new LinkedHashSet<>();
            int len = temp.get(i).length();
            for (String word: temp){
                if (len == word.length()){
                    setList.add(word);
                    stats.put(len, setList);
                }
            }
        }

        for (var item : stats.entrySet()) {
            System.out.printf("%d-> %s\n", item.getKey(), item.getValue());
        }
    }


//    static void printStats(String text) {
//        String cleanText = text.replace('.', ' ').replace(',', ' ')
//                .replace('"', ' ').toLowerCase(); // очистил от символов
//        String[] arr = cleanText.split("\s+"); // массив строк
//
//        List<String> arrTemp = Arrays.stream(arr).distinct()
//                .collect(Collectors.toList()); // удаление повторяющихся элементов
//
//        Map<Integer, List<String>> stats = new TreeMap<>();
//
//        for (int i = 1; i < 100; i++){
//            List<String> temp = new ArrayList<>();
//            for (int j = 0; j < arrTemp.size(); j++) {
//                if (arrTemp.get(j).length() == i) {
//                    temp.add(arrTemp.get(j));
//                    stats.put(i, temp);
//                }
//            }
//        }
//        for (var item : stats.entrySet()) {
//            System.out.printf("%d-> %s\n", item.getKey(), item.getValue());
//        }
//    }
    public static void main(String[] args) {

        String text = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";

        printStatsVar1(text);
        System.out.println();
        printStatsVar2(text);
    }
}