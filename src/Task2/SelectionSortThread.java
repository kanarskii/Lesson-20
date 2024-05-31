package Task2;

import java.util.Arrays;

public class SelectionSortThread extends Thread{
    private int[] array;

    public SelectionSortThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++){
            int min = i;
            for (int j = i; j < array.length; j++) {
                if(array[j] < array[min]){
                    min = j;
                }
            }
        }
        System.out.println(Arrays.toString(array) + " сортировка выбором");
    }
}
