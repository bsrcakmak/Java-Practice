package day02_variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        // 1. yol;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");

        int sayi=scan.nextInt();
        int ilkBasamak=sayi%10;
        System.out.println("ilk basamak= "+ilkBasamak);
        int ikinciBasamak=(sayi/10)%10;
        System.out.println("ikinci basamak= "+ikinciBasamak);
        int dorduncuBasamak=(sayi/1000)%10;
        System.out.println("dorduncu basamak= "+dorduncuBasamak);
        int besinciBasamak=(sayi/10000)%10;
        System.out.println("besinci basamak= "+besinciBasamak);

        System.out.println("istenen basamaklar toplamı= "+(ilkBasamak+ikinciBasamak+dorduncuBasamak+besinciBasamak));


        // 2. yol;

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen 5 basamakli bir sayi giriniz ");

        int num=input.nextInt();
        int ilkIkirkm=num/1000;
        System.out.println("ilkIkirkm = " + ilkIkirkm);//12

        int ilkIkiTop=(ilkIkirkm%10)+(ilkIkirkm/10);//2+1
        System.out.println("ilkIkiTop = " + ilkIkiTop);//3

        int sonIkiRkm=num%100;
        System.out.println("sonIkiRkm = " + sonIkiRkm);

        int sonIkiTop=(sonIkiRkm%10)+(sonIkiRkm/10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        
        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println("toplam = " + toplam);


    }
}
