package GeekBrains.AlgoAndData.lections;
// public class lection3 { // Связные списки
//     public class List {
//         Node head; // ссылка на первую позицию
//         Node tail; // ссылка на последнюю позицию

//         public void add(int value) { // функция добавления элемента в конец списка
//             Node node = new Node(); // Создаем новую ноду
//             node.value = value;
//             if (head == null) { // определяем, есль ли уже какие либо элементы в списке, или это первая нода
//                 head = node; // "head" становится текущей 'node'
//                 tail = node; // "tail" становится текущей 'node'
//             } else {
//                 tail.next = node; // берем текущий 'tail', его следующая 'node' равна нашей 'node'
//                 node.previous = tail; // наша 'node' ссылается на текущий 'tail'
//                 tail = node; // 'tail' обновляем значением нашей 'node'
//             }
//         }

//         public void add(int value, Node node) { // функция добавления элемента в средину списка
//             Node next = node.next;
//             Node newNode = new Node(); // создаем новую 'node'
//             newNode.value = value; // новая 'node' имеет следующее значение
//             node.next = newNode; // берем текущую 'node', ее следующее значение это новая 'node'
//             newNode.previous = node; // для 'newNode', ее предыдущее значение это текущая 'node'
//             if (next == null) {
//                 tail = newNode;
//             } else {
//                 next.previous = newNode;
//                 newNode.next = next;
//             }

//         }

//         public void delete(Node node) { // удаление элемента
//             Node previous = node.previous;
//             Node next = node.next;
//             if (previous == null) { // если предыдущая 'node' равна '0'
//                 next.previous = null;
//                 head = next;
//             } else {
//                 if (next == null) {
//                     previous.next = null;
//                     tail = previous;
//                 } else {
//                     previous.next = next;
//                     next.previous = previous;
//                 }
//             }
//         }

//         public Node find(int value) { // метод, кот ищет нужную ноду в списке
//             Node carrentNode = head;
//             while (carrentNode != null) {
//                 if (carrentNode.value == value) {
//                     return carrentNode;
//                 }
//                 carrentNode = carrentNode.next;
//             }
//             return null;
//         }

//         public class Node { // элемент связного списка
//             int value; // значение ноды
//             Node next; // ссылка на следующее значение

//             Node previous; // ссылка на предыдущее значение

//         }
//     }
// }
