// import java.util.Random;

// public class Linked {
//     private Node head;
//     private int size;

//     public void add(int value){     // добавление в конец
//         Node newNode = new Node(value); // создаем новую Node, в конструктор передаем значение(value)
//         if(head == null){head = newNode; size = 1; return;} // если HEAD пустой, то HEAD присваиваем значение newNode, size = 1
//         Node currentNode = head;
//         while(currentNode.next != null) currentNode = currentNode.next; // пока currentNode.next не равен null, переходм на след.
//         currentNode.next = newNode; // дошли до конца и записали значение новой Node
//         size ++;
//     }

//     public boolean remove(int value) {
//         if (remove(value, head) == null) return true;
//         else return false;
//     }
    
//     private Node remove(int value, Node startNode) { // метод удаления по значению
//         if(head == null) return null; 
//         Node currentNode = head;   
//         if(head.value == value){head = head.next; size--; return head;}
//         while(currentNode.next != null){     
//             if(currentNode.next.value == value){
//             currentNode.next = currentNode.next.next;
//             size--;
//             return currentNode.next;
//             }
//         currentNode = currentNode.next;
//         }
//         return null;
//     }

//     public int removeAll(int value) {
//         if (head == null) return 0;
//         int prevSize = this.size;
//         Node currentNode = remove(value, head);
//         while (currentNode != null) currentNode = remove(value, currentNode);
//         return prevSize - size;
//         }

//     public boolean removeAt(int index){     // метод удаления по индексу
//         if(head == null || index >= size) return false;
//         if(index == 0){head = head.next; size --; return true;} // если это голова, то голова следующая Node
//         Node currentNode = head;
//         for(int i = 0; i < index - 1; i++){currentNode = currentNode.next;}
//         currentNode.next = currentNode.next.next;
//         return true;
//     }

//     public int find(int value){        // поиск по значению. Показывает индекс
//         if (head == null) return -1;
//         Node currentNode = head;
//         for (int i = 0; currentNode != null; i++, currentNode = currentNode.next)
//             if (currentNode.value == value) return i;
//         return -1;
//     }

//     public void sort() {sort(0, size - 1);}

//     private void sort(int leftBorder, int rightBorder){
//         int leftMarker = leftBorder;
//             int rightMarker = rightBorder;
//             int pivot = this.getValue((leftMarker + rightMarker) / 2);
//             do {
//                 while (this.getValue(leftMarker) < pivot)
//                     leftMarker++;
//                 while (this.getValue(rightMarker) > pivot)
//                     rightMarker--;
//                 if (leftMarker <= rightMarker) {
//                     if (leftMarker < rightMarker)
//                         swap(leftMarker, rightMarker);
//                     leftMarker++;
//                     rightMarker--;
//                 }
//             } while (leftMarker <= rightMarker);
//             if (leftMarker < rightBorder)
//                 sort(leftMarker, rightBorder);
//             if (leftBorder < rightMarker)
//                 sort(leftBorder, rightMarker);

//     }

//     public int getSize(){return size;}

//     public void revers(){           // переворот списка
//         int len = size - 1;
//         for(int i = 0; i < len / 2 + 1; i++) swap(i, len - i);
//     }
    

//     private Node getNode(int index){        // метод вытаскивает Node по индексу
//         if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
//         Node currentNode = head;
//         for (int i = 0; i < index; i++) currentNode = currentNode.next;
//         return currentNode;
//     }

//     private int getValue(int index){        // метод вытаскивает значение Node по индексу
//         if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
//         Node currentNode = head;
//         for (int i = 0; i < index; i++) currentNode = currentNode.next;
//         return currentNode.value;
//     }

//     private void swap(int index1, int index2){      // заамена элементов местами по индексам
//         if (index1 < 0 || index1 >= size) return;
//         if (index2 < 0 || index2 >= size) return;
//         Node node1 = this.getNode(index1);
//         Node node2 = this.getNode(index2);
//         int temp = node1.value;
//         node1.value = node2.value;
//         node2.value = temp;
//     }

//     public void print() {           // вывод для тестирования
//         Node currentNode = head;
//         System.out.print("[ ");
//         while(currentNode != null){
//             System.out.print(currentNode.value + " ");
//             currentNode = currentNode.next;
//         }
//         System.out.print("]");
//     }
    
//     private class Node{     // создаем приватный класс Node (он только для класса LinkedList)
//         int value;          // значение
//         Node next;          // указатель на соседнюю Node
//         Node(){next = null;}// пустой конструктор
//         Node(int _value){this.value = _value;} // конструктор со значением
//         Node(int _value, Node _next){this.value = _value; this.next = _next;} // и значение и указатель на следующую Node
//     } 

    // public static void main(String[] args) {   
    //     Linked arr = new Linked();
    //     int n = 11;
    //     for(int i = 1; i < n; i++) {arr.add(new Random().nextInt(100));}
        
    //     arr.print();
    //     System.out.println();
    //     arr.revers();
    //     arr.print();  
    // } 
// }






