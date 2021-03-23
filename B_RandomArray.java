package tugasminggu_3;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
import java.util.Scanner;
public class B_RandomArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        
        System.out.print("SILAHKAN INPUT JUMLAH DERET : ");
        value = input.nextInt();
        int[] randomPosition = new int[value];
        for (int a = 0; a < value; a++) {
            randomPosition[a] = (int) (Math.random() * 10);
        }
        for (int b = 0; b < value; b++) {
            System.out.print(randomPosition[b] + " ");
        }
        System.out.println();
    }
}