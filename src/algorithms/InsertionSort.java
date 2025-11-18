package algorithms;

public class InsertionSort {
    public static void order(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int k = arr[i];

            int j = i -1;

            while (j >= 0 && arr[j] > k){
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = k;
        }
    }
}
