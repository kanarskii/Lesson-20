package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        BubbleSortThread bubbleSortThread = new BubbleSortThread(array);
        bubbleSortThread.start();
        SelectionSortThread selectionSortThread = new SelectionSortThread(array);
        selectionSortThread.start();
        InsertionSortThread insertionSortThread = new InsertionSortThread(array);
        insertionSortThread.start();
    }
}
