package tugasminggu_3;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
import java.util.Scanner;
public class E_SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("      CAFE CERIA");
        System.out.println("     ANEKA MINUMAN");
        System.out.println("-----------------------");

        // DATA MINUMAN
        System.out.println("     SPECIAL MENU");
        System.out.println("    1. Soft drinks");
        System.out.println("    2. Mix juice");
        System.out.println("    3. Nescafe");
        System.out.println("    4. Soda milk");
        System.out.println("    5. Tea");
        System.out.println("------------------------");

        // NAMA PEMBELI
        System.out.print("Masukkan nama pembeli             : ");
        String nama = input.nextLine();
        System.out.println("");

        // MEMILIH MINUMAN
        System.out.print("Silahkan masukkan pilihan anda    : ");
        int minuman = input.nextInt();

        // SWITH CASE OUTPUT PILIHAN MINUMAN
        switch (minuman) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Tidak ada data minuman");
        }
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + nama + " telah berkunjung diCafe Ceria");
    }
}