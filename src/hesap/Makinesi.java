package hesap;

import java.util.Scanner;

public class Makinesi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2,select;
        System.out.println("1.Sayıyı Giriniz:");
        num1 = input.nextInt();
        System.out.println("2.Sayıyı Giriniz");
        num2 = input.nextInt();

        System.out.println("1) Toplama \n 2)Çıkarma \n 3)Bölme \n 4)Çarpma \n İşlem seçiniz.  ");
        select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1/num2);
                break;
                case 4:
                System.out.println(num1*num2);
break;
            default:
                System.out.println("İşlem Yapılamadı");
                break;


        }

        System.out.println("İyi Günler");


        }




    }



