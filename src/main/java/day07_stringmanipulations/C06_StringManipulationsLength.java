package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {
    public static void main(String[] args) {


        /*
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */

        String cumle= "Bugun hava yagmurlu";
        System.out.println(cumle.length()); // 19

        String str1="";
        System.out.println(str1.length());

        String str2=" ";
        System.out.println(str2.length());



        // Kullanicidan isim ve soyismini girmesini isteyin
        // ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz: \n isim :");
        String isim= scanner.nextLine();
        System.out.println("Soyisim");
        String soyIsim= scanner.nextLine();

        if(isim.length()> soyIsim.length()){
            System.out.println("isminiz soyisminizden daha uzundur");
        }else if(isim.length()==soyIsim.length()) {
            System.out.println("Isminiz soyisminiz ile ayni uzunluktadir");
        }else
            System.out.println("Soyisminiz isminizden daha uzundur");


        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen 4 karakterli bir kelime girin.");

        String kelime= input.nextLine();
        System.out.println(kelime.length());

        if (kelime.length()==4){
            char bir=kelime.charAt(0);
            char iki=kelime.charAt(1);
            char uc=kelime.charAt(2);
            char dort=kelime.charAt(3);

            System.out.println("Tersten yazilmis hali: "+ dort+uc+iki+bir);

        } else if (kelime.length()>4) {
            System.out.println("Girdiginiz kelime 4 karakterden fazla");
        } else if (kelime.length()<4) {
            System.out.println("Girdiginiz kelime 4 karakterden az");
        }




    }
}
