package GeekBrains.AlgoAndData.Seminars;
// import java.time.Duration;
// import java.time.LocalTime;
// // import java.util.Arrays;
// // import java.util.Random;

// public class seminar2 {   
//     // public static void main(String[] args){   
//     //     int[] array = new int[2000]; // Пустой массив на 20 элементов
//     //     for(int i = 0; i < array.length; i++) array[i] = (int)(Math.random()*1000); // Заполняем массив рандомно  
//     //     // System.out.println("arr1: " + Arrays.toString(array));   // Форма вывода массива
        
//     //     int[] array2 = array;
//     //     // System.out.println("arr2: " + Arrays.toString(array2));
       
//     //     LocalTime timeQuickSortStart = LocalTime.now();
//     //     quickSort(array);
//     //     // System.out.println("sort1: " + Arrays.toString(array));
//     //     LocalTime timeQuickSortEnd = LocalTime.now();

//     //     LocalTime timeInsertSortStart = LocalTime.now();
//     //     inserterSort(array2);
//     //     // System.out.println("sort2: " + Arrays.toString(array2));
//     //     LocalTime timeInsertSortEnd = LocalTime.now();
        
//     //     System.out.println(Duration.between(timeQuickSortStart, timeQuickSortEnd));
//     //     System.out.println(Duration.between(timeInsertSortStart, timeInsertSortEnd));
//     // }

//     static void quickSort(int[] array) {
//         quickSortRecursive(array, 0, array.length - 1);
//         // System.out.println(Arrays.toString(array));
//     }
    
//     static void quickSortRecursive(int[] array, int leftBorder, int rigthBorder){
//         int leftMarker = leftBorder;
//         int rigthMarker = rigthBorder;
//         int pivot = array[(leftMarker + rigthMarker) / 2];
//         do {
//             while(array[leftMarker] < pivot)
//                 leftMarker ++;
//             while(array[rigthMarker] > pivot)
//                 rigthMarker --;
//             if(leftMarker <= rigthMarker){
//                 if(leftMarker < rigthMarker){
//                     int temp = array[leftMarker];
//                     array[leftMarker] = array[rigthMarker];
//                     array[rigthMarker] = temp;
//                 }
//                 leftMarker ++;
//                 rigthMarker --;
//             }
//             } while(leftMarker <= rigthMarker);
//         if(leftMarker < rigthBorder) quickSortRecursive(array, leftMarker, rigthBorder);
//         if(leftBorder < rigthMarker) {quickSortRecursive(array, leftBorder, rigthMarker);}
//     }

//     public static void inserterSort(int[] array) {
//         for (int left = 0; left < array.length; left++){
//             int value = array[left];
//             int i = left - 1;
//             for (; i >= 0; i--){
//                 if (value < array[i]) array[i + 1] = array[i];
//                 else break; 
//             }
//             array[i + 1] = value;
//         }
//     }
// }
