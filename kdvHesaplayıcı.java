package Dersler;
import java.util.Scanner;
public class kdvHesaplayıcı {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdvTutari, topTutar;

        Scanner input= new Scanner(System.in);
        System.out.print("Tutarı giriniz:");
        tutar= input.nextDouble();

        if (tutar<1000){
            kdvOrani=0.18;
        }
        else{
            kdvOrani=0.08;
        }

        kdvTutari=tutar*kdvOrani;
        topTutar=tutar+kdvTutari;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Toplam Tutar: " + topTutar);





    }
}
