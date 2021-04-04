package tugasminggu_4;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
import java.util.Scanner;
public class A_ProgramBilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // JUDUL PROGRAM
        System.out.println("..::: #PROGRAM MENAMPILKAN BILANGAN GENAP# :::..");
        System.out.println();
        
        // INPUT BATAS BILANGAN
        System.out.print("O> INPUT BATAS AWAL BILANGAN     : ");
        int batasAwal = input.nextInt();
        System.out.print("O> INPUT BATAS AKHIR BILANGAN    : ");
        int batasAkhir = input.nextInt();
        System.out.println();

        // OUTPUT BILANGAN GENAP
        System.out.print("O> RESULT : ");
        for (int bil = batasAwal; bil <= batasAkhir; bil++) {
            if (bil % 2 == 0) {
                System.out.print(bil + "  ");
            }
        }
        System.out.println();
    }
}