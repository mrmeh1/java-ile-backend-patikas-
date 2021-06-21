package java_proje;
import java.util.Scanner;
public class basamakSayisiBulma {
    public static void main(String[] args) {
        int sayi,toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        sayi = input.nextInt();

        while(sayi>0) {
            toplam+= sayi%10;
            sayi=sayi/10;
        }
        System.out.println(toplam);
    }
}
