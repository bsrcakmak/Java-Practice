package day07_stringmanipulations;

public class C02_StringManipulationsSubstring {
    public static void main(String[] args) {

        /* substring()
         //substring() in iki kullanimi vardir.
         //1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar
         //2)substring(baslangic indexi) String'in verilen index'ten sonuna kadar almaya yarar. Sonuc ise String dir.
         */


        String cumle = "Her dert Java gibi olsa";

        // Soru-1: 10.index dahil sonuna kadra verilen Stringi yazdiriniz
        // Soru-2: son 10 harfi yazdirin >>>>gibi olsa:
        // Soru-3: ilk 10 karakteri alma yontemi
        // Soru-4: 11.ci karakterden sonuna kadar olan Stringi yazdiralim

        // Cevap-1:
        System.out.println(cumle.substring(10));   // ava gibi olsa

        // Cevap-2:
        System.out.println(cumle.substring(cumle.length()-9));

        // Cevap-3:
        System.out.println(cumle.substring(0,11));

        // Cevap-4:
        System.out.println(cumle.substring(10));






    }
}
