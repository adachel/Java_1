package AlgoAndData.Seminars;

import java.util.Random;

public class HashTable <K, V> {     // К(key) - ключ; V(value) - значение
    private static final int DEFAULT_SIZE = 4; // минимальный эффективный размер таблицы
    private static final double LOAD_FACTOR = 0.75; // настолько будет держать заполненность массива. Для равномерного распред, чтобы было меньше коллизий. 
                                                    //Для уменьшения сложности поиска.
    private int size; // это заполненные ячейки массива
    private Bucket<K, V>[] buckets; // создаем массив ведер

    public HashTable() {this(DEFAULT_SIZE);} // конструктор. this - это и есть HashTable

    public HashTable(int _size) { // конструктор от размера
        if (_size <= DEFAULT_SIZE) buckets = new Bucket[DEFAULT_SIZE]; // меньше 4 делать не позволяем, ставим 4
        else buckets = new Bucket[_size]; // здесь размер как и задан, т.к. он > 4
        size = 0;
    }

    private int calculateIndex(K key) { // создатель хэшей по ключу
        return Math.abs(key.hashCode() % buckets.length); // ограничиваем значение FashCode в пределах длинны
    }

    public boolean add(K key, V value) { // добавление в массив
        if (buckets.length * LOAD_FACTOR < size) resize();
        int index = calculateIndex(key); // генерируем индекс от ключа
        Bucket<K, V> bucket = buckets[index]; // создаем темповую переменную bucket, в кот. закидываем текущее значение ведра
        if (bucket == null) { // если ведро пустое
            bucket = new Bucket<>(); // то под него выделяется память
            buckets[index] = bucket;
        }
        boolean added = bucket.add(key, value); // cоздаем ноду с текущими значениями
        if (added) size++;
        return added;
    }

    public boolean remove(K key) { // удаление из массива
        int index = calculateIndex(key);
        Bucket<K, V> bucket = buckets[index];
        if (bucket == null) return false;
        boolean removed = bucket.remove(key); // метод из класса Bucket
        if (removed) size--;
        return removed;
    }

    public void print() {
        for (var item : buckets) {
            if (item != null) {
                item.print();
                System.out.println();
            } 
            else System.out.println("---");
        }
    }

    private void resize() {
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket<K, V> bucket = old[i];
            if (bucket == null) continue;
            Bucket.Node currentNode = bucket.root;
            while (currentNode != null) {
                this.add((K) currentNode.pair.key, (V) currentNode.pair.value);
                currentNode = currentNode.next;
            }
            old[i] = null;
        }
        old = null;
    }

    private class Bucket<K, V> {    // класс корзина(ведро). Это односвязный список 
        Node root; // головная Node

        public boolean add(Pair pair) { // метод добавления в список(корзину)
            Node newNode = new Node(); // создаем новую Node
            newNode.pair = pair; // присваиваем значения новой Node
            if (root == null) {  // проверяем, что голова пустая
                root = newNode;  // если голова пустая, то значения новой node записываем в голову
                return true;     // т.к. у нас boolean
            }
            Node currentNode = root; // если голова была не пустая, то тек.node присваиваем значения головы
            while (currentNode != null) {   // проходимся по всему списку до конца, пока тек.node не будет null 
                if (currentNode.pair.key.equals(pair.key)) return false; // если ключ тек.node == ключу node, кот. хотим добавить, то false(не добавляем)
                if (currentNode.next == null) { // когда след за тек.node == null
                    currentNode.next = newNode; // то в нее записываем значения новой node, т. е новые значения в конец списка
                    return true;
                }
                currentNode = currentNode.next; // тек.node = следующей node
            }
            return false; // если ничего не нашли
        }

        public boolean add(K key, V value) { // т.к. метод Pair приваатный
            Pair pair = new Pair(key, value); // создаем новый Pair
            return this.add(pair); // запускаем метод добавления
        }

        public boolean remove(K key) { // метод удаления по ключу
            if (root == null) return false; // если список пусто, то мы ничего не можем удалить
            if (root.pair.key.equals(key)) { // если нашли, то что нужно удалить, то
                root = root.next;   // значения головы = значениям следующего элемента
                return true;
            }
            Node currentNode = root;
            while (currentNode.next != null) {
                if (currentNode.next.pair.key.equals(key)) { // если следующий ключ == искомому ключу
                    currentNode.next = currentNode.next.next; // то значения следующей node = значениям за следующей нодой
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public V getValue(K key) { // поиск значения по ключу
            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.pair.key.equals(key)) return currentNode.pair.value;
                currentNode = currentNode.next;
            }
            return null;
        }

        public boolean set(K key, V value) { // по ключу ищем, по value задем знчение
            Node currentNode = root;
            while (currentNode != null) {
                if (currentNode.pair.key.equals(key)) { // если ключ тек.node == искомому
                    currentNode.pair.value = value; // то значения тек.node меняем на значения с искомым ключем
                    return true;
                }
                currentNode = currentNode.next;
            }
            return false;
        }

        public void print() { // печатает Node
            Node currentNode = root;
            while (currentNode != null) {
                System.out.print("[" + currentNode.pair.key + ":" + currentNode.pair.value + "]");
                currentNode = currentNode.next;
            }

        }

        private class Node { // Node для связного списка в "корзинах"
            Pair pair; // пара значение
            Node next; // значения следующей Node
        }

        private class Pair {    // Данные
            K key;          // Ключ
            V value;        // Значение

            public Pair() {} // конструктор без значений
            public Pair(K _key, V _value) {   // конструктор со значениями
                this.key = _key;
                this.value = _value;
            }
        }
    }

    public static void main(String[] args){
        HashTable<Integer, Integer> table = new HashTable<>();
        for(int i = 0; i < 20; i++){
            Integer key = new Random().nextInt(30);
            Integer value = new Random().nextInt(30);
            table.add(key, value);
        }


        table.print();
    }   
}
