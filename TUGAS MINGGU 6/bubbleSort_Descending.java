package TugasMinggu_6;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
public class bubbleSort_Descending {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int swapping = 0;
        
        for(int i=0; i < n; i++) {         
           for(int j=1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                   // SWAP ELEMENTS
                   temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
                   swapping++;
                }
            }
        }
        firstView(arr);
        System.out.println();
        System.out.println("O> Proses Swapping Sebanyak : " + swapping + "x Penukaran");
    }
    
    static void firstView(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ") ;
        }
        System.out.println();
    }
    
    static void secondView(int[] arr) {
        int n = arr.length -1;
        
        for(int j = n ; j > 0; j--) { 
            System.out.print(arr[j] + " ") ;
        }
        System.out.println() ;
    }
    
    public static void main (String [] args) {
        int arr[] ={3,60,35,2,45,320,5};
    
        System.out.println("ARRAY BEFORE BUBBLE SORT");
        firstView (arr);
        System.out.println();
        
        System.out.println("ARRAY AFTER BUBBLE SORT");
        bubbleSort (arr);
        System.out.println();
        
        System.out.println("ARRAY AFTER BUBBLE SORT (DESCENDING)");
        secondView (arr);
        System.out.println();
    }
}