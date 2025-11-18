package algorithms;

public class QuickSort {
    public static void order(int[] arr, int left, int right) {
        int n = arr.length;

        if (left < right) {
            int pi = partition(arr, left, right);
            order(arr, left, pi - 1);
            order(arr, pi + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right){
        int pi = arr[left];

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pi) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                int temp = arr[i + 1];
                arr[i + 1] = arr[right];
                arr[right] = temp;

        }

        return i + 1;
    }
}
