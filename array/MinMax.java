package array;

import java.util.Scanner;

public class MinMax{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        int min, max;

        for(int i = 0; i < 10; i++){
            System.out.print("array [" + i + "] = ");
            array[i] = input.nextInt();
        }
        input.close();

        min = max = array[0];

        for(int i = 1; i < 10; i++){
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }

        System.out.println("min = " + min + "\nmax = " + max);
    }
}