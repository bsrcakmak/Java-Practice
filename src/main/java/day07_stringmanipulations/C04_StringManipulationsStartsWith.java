package day07_stringmanipulations;

public class C04_StringManipulationsStartsWith {
    public static void main(String[] args) {


        /*
         ===>  startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *
         ===> endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String cumle="Kazananlara hic hata yapmayanlar degil,vazgecmeyenlerdir";

        System.out.println(cumle.startsWith("K"));  // true
        System.out.println(cumle.endsWith("dir"));  // true



    }
}
