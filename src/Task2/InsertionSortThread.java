package Task2;

import java.util.Arrays;

public class InsertionSortThread extends Thread {
    private int[] array;

    public InsertionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }
        System.out.println(Arrays.toString(array) + " сортировка вставками");
    }
}
