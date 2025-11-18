package algorithms;

public class BubbleSort {
    public static void order(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++){

            for (int j = 0; j < n-i-1; j++){

                if (arr[j] > arr[j + 1]) {

                    int aux = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = aux;

                }
            }
        }
    }
}
