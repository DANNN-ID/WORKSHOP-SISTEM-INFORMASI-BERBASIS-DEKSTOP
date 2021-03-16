package belajar;
/*
    NAMA    : AHMAD WILDAN
    NIM     : E41201452 
*/
public class Test_OutputString {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String ("DEF");
        String s3 = "AB"+"C";
        
        System.out.println("Perbandingan S1 dan S2 : " + s1.compareTo(s2));
        System.out.println("S2 equals to S3 : " + s2.equals(s3));
        System.out.println("S3 sama dengan S1: " + s3 == s1);
        System.out.println("Perbandingan S2 dan S3 : " + s2.compareTo(s3));
        System.out.println("S3 equals to S1 :  " + s3.equals(s1));
    }
}