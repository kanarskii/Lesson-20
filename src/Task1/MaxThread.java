package Task1;

public class MaxThread extends Thread{

    private int[] array;

    public MaxThread(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max + " максимальное число в массиве");
    }
}
