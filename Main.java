import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double elma,armut,muz,patlican,domates,toplam;

        Scanner inp =new Scanner(System.in);
        System.out.print("Armut kaç kilo ?");
        armut= inp.nextDouble();
        System.out.print("Elma Kaç Kilo ?");
        elma= inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?");
        patlican= inp.nextDouble();
        System.out.print("Muz Kaç Kilo ?");
        muz= inp.nextDouble();
        System.out.print("Domates Kaç Kilo ?");
        domates= inp.nextDouble();

        toplam=(armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0);
        System.out.print("Toplam Tutarınız :"+toplam);
    }
    }
www.patika.dev
