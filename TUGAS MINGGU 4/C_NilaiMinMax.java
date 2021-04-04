package tugasminggu_4;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
import java.util.Scanner;
public class C_NilaiMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai[];
        int banyakData, nilaiRataRata;
        int total = 0;
        
        System.out.println("..::: #PROGRAM MENAMPILKAN NILAI MINIMUM, MAKSIMUM, & RATA-RATA# :::..");
        System.out.println();
        
        System.out.print("SILAHKAN INPUT BANYAKNYA DATA NILAI : ");
        banyakData = input.nextInt();
        nilai = new int[banyakData];
        System.out.println();
       
        for (int noUrutNilai = 0; noUrutNilai < banyakData; noUrutNilai++) {
            System.out.print("O> MASUKAN DATA NILAI KE-" + (noUrutNilai+1) + " : ");
            nilai[noUrutNilai] = input.nextInt();
            total += nilai[noUrutNilai];
        }
        System.out.println("");
        
        // VARIABEL NILAI MIN & MAX
        int nilaiMin = nilai[0];
        int nilaiMax = nilai[0];
        
        // NILAI MAX
        for (int b = 0; b < banyakData; b++) {
            if (nilai[b] > nilaiMax){
                nilaiMax = nilai[b];
            }
            // NILAI MIN
            for (int c = 0; c < banyakData; c++) {
                if(nilai[c] < nilaiMin){
                    nilaiMin = nilai[c];
                }    
            } 
        }
        
        // RUMUS MENCARI NILAI RATA-RATA
        nilaiRataRata = total / banyakData;
        System.out.println("RESULT~");
        System.out.println("Nilai minimum dari data di atas adalah  : " + nilaiMin);
        System.out.println("Nilai maksimal dari data di atas adalah : " + nilaiMax);
        System.out.println("O> Rata-rata nilai dari data di atas adalah : " + nilaiRataRata);
        System.out.println();
    }
}