package tugasminggu_3;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
*/
public class C_Array2D {
    public static void main(String[] args) {
        int [][] nilai = {{5,6,1,7},{8,1,2,9},{5,4,7,1},{8,3,7,5}};
        int x;
        int y;
        
        for (x = 0; x < 4; x++) {
            for(y = 0; y < 4; y++) {
                System.out.print(nilai[x][y] + " ");
            }
            System.out.println();
        }
    }
}