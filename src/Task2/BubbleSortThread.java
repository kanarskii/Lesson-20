package Task2;

import java.util.Arrays;

public class BubbleSortThread extends Thread {
    private int[] array;

    public BubbleSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int a = array[i];
                        array[i] = array[j];
                        array[j] = a;
                        flag = true;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array) + " сортировка пузырьком");
    }
}
