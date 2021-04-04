package tugasminggu_4;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
public class B_ProgramBilanganPerkalian2 {
    public static void main(String[] args) {
        System.out.println("..::: #PROGRAM BILANGAN PERKALIAN 2 (0 - 100)# :::..");
        System.out.println();
        
        int value = 0;
        int batasBilangan = 100;
        
        do {
            if (value == 0) {
                value = 1;
            }
            else {
                System.out.print(value * 2 + " ");
            }
            value++;
        }
        while (value <= batasBilangan);
        System.out.println();
    }
}