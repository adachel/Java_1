package AlgoAndData.homework;
// import java.util.Arrays;

public class homeWork {
    public static void heapSort(int[] arr, int n){
        // int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n, int i) {
        int parent = i;
        int left = 2 * i + 1;
        int rigth = 2 * i + 2;
        if(left < n && arr[left] > arr[parent]) parent = left;
        if(rigth < n && arr[rigth] > arr[parent]) parent = rigth;
        if(parent != i){
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;
            heapify(arr, n, parent);
        }
    }

    public static void Creat(int[] arr, int n) {for(int i = 0; i < n; i++) arr[i] = (int)(Math.random()*100);}
    
    // public static void main(String[] args){
    //     int n = 10;
    //     int[] arr = new int[n];
    //     Creat(arr, n);
    //     System.out.println(Arrays.toString(arr));
    //     heapSort(arr, n);
    //     System.out.println(Arrays.toString(arr));
    // }   
}
