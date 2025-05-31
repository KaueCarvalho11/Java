package mat;

import java.util.Scanner;

public class Matriz{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int m[][] = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("[" + i + "]" + "[" + j + "] = ");
                m[i][j] = input.nextInt();
            }
        }
        input.close();
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(m[i][j] + "\t");
                if(j == 3){
                    System.out.print("\n");
                }
            }
        }
    }
}