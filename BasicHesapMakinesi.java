import java.util.Scanner;

public class BasicHesapMakinesi {
    
   public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    double a , b ;
    
    System.out.print("İlk Sayıyı Gir :");
    a = scan.nextDouble();

    System.out.print("İkinci Sayıyı Gir :");
    b = scan.nextDouble();

    System.out.println("\nİşlem Seçiniz : \n1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
    System.out.print("\nSEÇİLEN İŞLEM SAYISINI GİRİNİZ : ");
    double secim = scan.nextDouble();

    if (secim == 1){
    System.out.println("Sonuç :" + (a+b));
    } else if (secim == 2 ){
        System.out.println("Sonuç : " + (a - b ));
    }
    else if (secim == 3 ){
        System.out.println("Sonuç : " +(a*b));
    }
    else if (secim == 4){
        System.out.println("Sonuç :" +(a/b));

    }



   }
}
