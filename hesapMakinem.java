package Dersler;
import java.util.Scanner;
public class hesapMakinem {
    public static void main(String[] args) {
        int Tarih,Biyoloji,İngilizce,Fizik,Kimya,Matematik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Fizik Notunuzu Girin : ");
        Fizik = inp.nextInt();
        System.out.print("Matematik Notunuzu Girin : ");
        Matematik = inp.nextInt();
        System.out.print("Tarih Notunuzu Girin : ");
        Tarih = inp.nextInt();
        System.out.print("Kimya Notunuzu Girin : ");
        Kimya = inp.nextInt();
        System.out.print("Biyoloji Notunuzu Girin : ");
        Biyoloji = inp.nextInt();
        System.out.print("İngilizce Notunuzu Girin : ");
        İngilizce= inp.nextInt() ;
        int toplam = (Matematik + Fizik + Tarih + Kimya + İngilizce + Biyoloji );
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız: "+ sonuc);

        boolean ortalama = sonuc >=50;
        String str = ortalama ? "TEBRİKLER SINIFI GEÇTİNİZ" : "SINIFTA KALDINIZ !";
        System.out.print(str);






    }





}
