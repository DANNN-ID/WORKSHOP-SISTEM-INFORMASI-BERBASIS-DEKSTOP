package TugasMinggu_6;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
public class selectionSort {
    static void selectionSort(int[] arr) {
        int valueStart = arr.length;
        int swap = 0;
        
        for (int value = 0; value < valueStart; value++) {   
            int min = value;
            for (int initialize = value + 1; initialize < valueStart; initialize++) {
                 if (arr[initialize] > arr[min]) {
                     min = initialize;
                 }
            }
            int temp = arr [min];
            arr[min] = arr [value];
            arr[value] = temp;
            swap++ ;
        }
        valueView(arr);
        System.out.println();
        System.out.println("O> Proses Swapping Dilakukan Sebanyak " + swap + "x Penukaran");
    }
    
    static void valueView(int[] arr) {
        int valueStart = arr.length;
        for (int value = 0 ; value < valueStart; ++value) {
            System.out.print(arr[value] + " ") ;
        }
        System.out.println() ;
    }
              
    public static void main (String [] args) {
        int arr[] ={7, 4, 5, 9, 8, 2, 1 };
        
        System.out.println("ARRAY BEFORE SELECTION SORT");
        valueView (arr);
        System.out.println();
        
        System.out.println("ARRAY AFTER SELECTION SORT");
        selectionSort (arr);
        System.out.println();
    }
}