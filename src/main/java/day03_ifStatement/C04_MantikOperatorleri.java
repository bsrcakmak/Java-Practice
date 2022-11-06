package day03_ifStatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

        // && ile && arasindaki fark
        // && de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        // sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

        System.out.println(5+2==8);  // false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc1 ==> "+sonuc1); // true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2!=8;
        System.out.println("sonuc2 ==> "+sonuc2);  // false

        boolean sonuc3=5>4 & 7>9 & 6+3==9 & 5+2!=8;  // false sadece daha yavas calisir
        System.out.println("sonuc3 ==> "+sonuc3);

        // sayi1'in 10 ile 20 arasinda oldugunu true diyerek dondurelim
        int sayi1=15;
        System.out.println(sayi1>10 && sayi1<20 ); // true

        // 10<sayi1<20 Java uclu karsilastirma yapmaz
        // Ikili karsilastirmalar yapip mantiksal Operatorler ile birlestirmeliyiz


        // sayi2'in 10 ile 20 arasinda olmadigini true diyerek dondurelim
        int sayi2=5;
        System.out.println(sayi2<10 || sayi2>20);  // true

        //&&==ve  ||=veya
        //5 6 7 8 9 10  11 12 ...........20




    }
}
