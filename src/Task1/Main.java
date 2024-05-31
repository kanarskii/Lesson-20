package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        MinThread minThread = new MinThread(array);
        MaxThread maxThread = new MaxThread(array);
        minThread.start();
        maxThread.start();
    }
}
