package belajar;

public class KesalahanVariabel {
    public static void main(String[] args) {
		
        // Pendeklarasian Variable yang Benar
        boolean gameOver = false;
        int student = 50, classes = 3;
        double  sales_tax;
        short number1;

        // Pendeklarasian Variable yang Salah
        int 2beorNotbe;
        // Penjelasan kesalahan : Kesalahan pada pendeklarasian variable tersebut terjadi karena nama variable menggunakan angka           sebagai awalan variable. Seharusnya tidak boleh menggunakan angka pada awalan variable, seperti contoh : int                    duaBeorNotBe
        
        float price index;
        // Penjelasan kesalahan : Kesalahan pada pendeklarasian variable tersebut adalah terjadi karena pemisahan kata dengan              spasi. Seharusnya variable tersebut tidak usah dipisah dengan spasi, tetapi disambung menggunakan tata penulisan                Camel Case. Contoh : float priceIndex
        
        double lastYear'sPrice;
        // Penjelasan kesalahan : Kesalahan pada pendeklarasian variable tersebut terjadi karena menggunakan simbol single quote           pada variable. Seharusnya tidak boleh menggunakan simbol single quote pada variable. Contoh yang benar adalah :                 double lastYearsPrice
        
        long_class;
        // Penjelasan kesalahan : Class merupakan keyword pada java sehingga tidak bisa dijadikan variable.
        
	}
}