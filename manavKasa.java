package Dersler;
import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00 , a,e,d,m,p , tutar;


        Scanner kasa = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız?: ");
        a = kasa.nextDouble();
        System.out.print("Kaç kilo elma aldınız?: ");
        e = kasa.nextDouble();
        System.out.print("Kaç kilo domates aldınız?: ");
        d= kasa.nextDouble();
        System.out.print("Kaç kilo muz aldınız?: ");
        m= kasa.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız: ");
        p= kasa.nextDouble();
        tutar = ((armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p));
        System.out.print("Toplam Tutar: " + tutar);
    }
}
