package day06_nestedifswitch;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("pazartesi : 1\t sali : 2\t carsamba : 3 \t persembe : 4 \t cuma : 5 \t cumartesi : 6 \t pazar : 7 \n" +
                "Haftanin kacinci gununde oldugunuzu yaziniz");

        int kacinciGun= input.nextInt();

        if (kacinciGun<=0 || kacinciGun>7){
            System.out.println("Hatali veri girdiniz.");
        }else{

            System.out.println("Kac gun sonrasini bilmek istiyorsunuz?");
            int kacGunSonrasi=input.nextInt();
            int bulunanGun= (kacGunSonrasi+kacinciGun) %7 ;

            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Pazartesi");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Sali");
                    break;

                case 3:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Carsamba");
                    break;

                case 4:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Persembe");
                    break;

                case 5:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Cumartesi");
                    break;

                case 0:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Pazar");
                    break;
                default:
                    System.out.println();





            }





        }






    }
}
