package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz

//        Scanner scan= new Scanner(System.in);
//        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
//
//        int sayi=scan.nextInt();
//        int ilkBasamak= sayi%10;
//        int sonBasamak= sayi/1000;
//        System.out.println(ilkBasamak+sonBasamak);
        // Bir sayinin birler basamagini %10 ile hesaplatabiliriz.


        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
        /* Ornek : Inputs : 853
    Output : Girdiginiz sayinin birler basamagi : 3
             Girdiginiz sayinin onlar basamagi : 5
             Girdiginiz sayinin yuzler basamagi : 8
*/

        Scanner scan2= new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");

        int s=scan2.nextInt();

        int birler=s%10;
        System.out.println("Girdiginiz sayinin birler basamagi: "+birler);
        int onlar=(s/10)%10;
        System.out.println("Girdiginiz sayinin onlar basamagi: "+onlar);
        int yuzler=s/100;
        System.out.println("Girdiginiz sayinin yuzler basamagi: "+yuzler);




    }
}
