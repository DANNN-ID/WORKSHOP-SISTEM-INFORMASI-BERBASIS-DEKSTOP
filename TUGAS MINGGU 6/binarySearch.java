package TugasMinggu_6;
/*
    @author : AHMAD WILDAN
    NIM     : E41201452
    GOL     : TIF B - BONDOWOSO
*/
public class binarySearch {
    public static void main(String[] args) {
        int value[] = {3,9,11,12,15,17,20,23,31,35};
        int key = 17 ;
        int indexArray = value.length / 2;
        int midValue = indexArray;
        boolean findingData = false;

        while (indexArray >= 0 && indexArray < value.length && findingData == false) {
            if (key == value[indexArray]) {
            	System.out.println("DATA DITEMUKAN PADA INDEX ARRAY KE-" + indexArray);
                findingData = true;
            }
            else {
                if (key < value[midValue]) {
                    indexArray--;
                }
                else {
                    indexArray++;
                }
            }
        }

        if (findingData == false) {
            System.out.println("DATA TIDAK DITEMUKAN");
        }
    }
}