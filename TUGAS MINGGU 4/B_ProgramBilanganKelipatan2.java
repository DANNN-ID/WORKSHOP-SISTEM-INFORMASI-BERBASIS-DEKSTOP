package tugasminggu_4;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
public class B_ProgramBilanganKelipatan2 {
    public static void main(String[] args) {
        int value = 1;

        // JUDUL PROGRAM
        System.out.println("..::: #PROGRAM BILANGAN KELIPATAN 2 (0 - 100)# :::..");
        System.out.println();

        // OUTPUT BILANGAN
        System.out.print("O> RESULT :");
        do {
            System.out.print("  " + value);
            value = value * 2;
        }
        while (value < 100); {
            System.out.println("");
        }
        System.out.println();
    }
}