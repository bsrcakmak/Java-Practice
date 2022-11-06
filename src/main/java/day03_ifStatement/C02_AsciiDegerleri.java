package day03_ifStatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {

     char harf='a';
     char harf2='A';

        System.out.println("harf>harf2 ==> "+(harf>harf2));  // harf>harf2 ==> true

        // Karsilastirma islemlerinin sonucu true yada false (boolean) doner.
        // Buyuk harflerin ASCII degerleri, kucuk harflerin ASCII degerlerinden daha kucuktur.

        // Example 1: Herhangi bir char variable'in ASCII degerlerini kod yazarak bulunuz

        // 1. yol;
        char space= ' ';
        System.out.println("Space'in ASCII degeri: "+(space+0)); // 32
        // space'in ASCII degerini hesaplamak icin toplamaya etkisi olmayan "0" ı seceriz.
        // Boylece yazdirdigimiz deger space'in ASCII degerini verir.

        char hrf= 'C';
        System.out.println("C'nin ASCII degeri: "+(hrf+0));  // 67


        // 2. yol;
        // char'larda Java char karaktere int'da atayabiliriz.
        // Cunku char'in bir resim karakteri birde matematiksel ASCII degeri vardir
        // Bu nedenle ASCII degerlerini hesaplayabiliriz.


        int harf3='m';
        System.out.println("m'nin ASCII degeri= " + harf3); // 109

        byte b1=12;
        byte b2=-125;  // bu degerleri kıyaslayın.
        System.out.println("b1>b2 ==> "+(b1>b2));  // true


        float f1=2.45645f;
        float f2=5.86786f;
        System.out.println("f1>f2 ==> "+(f1>f2));  // false
        System.out.println("b1>f1 ==> "+(b1>f1));  // true


        long lng1= 5456456456L;
        System.out.println("b1<lng1 ==> "+(b1<lng1));  // true

        char ch='h';
        System.out.println("b1>ch ==> "+(b1>ch));  // false

    }
}
