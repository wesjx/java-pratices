import algorithms.*;

public class Main {
    public static void main(String[] args) {
        int[] vector = {5, 2, 1, 4, 3};

        System.out.print("Input array: ");
        for (int num : vector) {
        System.out.print(num + " ");
        }
        System.out.println();

        //Bubble Sort
        BubbleSort.order(vector);

        System.out.print("Output array: ");
        for(int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("<--- Bubble Sort ----");

        //Selection Sort
        SelectionSort.order(vector);

        System.out.print("Output array: ");
        for(int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("<--- Selection Sort ----");

        //Inserction Sort
        InsertionSort.order(vector);

        System.out.print("Output array: ");
        for(int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("<--- Insertion Sort ----");

        //Merge Sort
        MergeSort.order(vector, 0, vector.length - 1);

        System.out.print("Output array: ");
        for(int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("<--- Merge Sort ----");

        //Quick Sort
        QuickSort.order(vector, 0, vector.length - 1);

        System.out.print("Output array: ");
        for(int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("<--- Quick Sort ----");

        //Shell Sort
        ShellSort.order(vector);

        System.out.print("Output array: ");
        for(int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println("<--- Shell Sort ----");

    }
}