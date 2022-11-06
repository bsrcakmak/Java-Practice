package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

//        Scanner input=new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz");
//        String kullaniciIsmi= input.nextLine();
//
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Lutfen cemberin yaricapini girin");
//        double r=scan.nextDouble();
//        float pi=3.1415f;
//        System.out.println("alan: "+pi*r*r+"-"+"cevre: "+2*pi*r);
//
//
//
//        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
//        // cevre hesabini yapan bir program yaziniz.
//
//        Scanner scan1=new Scanner(System.in);
//        System.out.println("Lutfen kisa kenar uzunlugunu giriniz");
//
//
//
//        //Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
//        // Ucgenin cevresi=a+b+c
//        Scanner scan2=new Scanner(System.in);
//        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");
//        byte a=scan2.nextByte();
//        byte b=scan2.nextByte();
//        byte c=scan2.nextByte();
//        int cevre=a+b+c;
//        System.out.println("ucgenin cevresi: "+cevre);
//

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */

        Scanner scan3=new Scanner(System.in);
        System.out.println("Lutfen bir sembol giriniz");

        char s=scan3.next().charAt(0);
        System.out.println("  "+s+"\n"+" "+s+" "+s+"\n"+s+" "+s+" "+s);


        System.out.println(" ");






    }
}
