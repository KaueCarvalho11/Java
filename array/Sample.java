package array;

public class Sample{
    private static int sample[];
   
    public static void main(String[]args){
        sample = new int[10];

        for(int i = 0; i < 10; i++){
            sample[i] = i;
            System.out.println("Posição [" + i + "] = " + sample[i]);
        }
    }
}