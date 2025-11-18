package algorithms;

public class SelectionSort {
    public static void order(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int aux = arr[i];
            arr[i] =arr[smallest];
            arr[smallest] = aux;
        }
    }
}
