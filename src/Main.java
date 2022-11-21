import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //DEĞİŞKENLER
        double r,a;
        double pi = 3.14;

        //GİRDİLER

        Scanner input = new Scanner(System.in);


        System.out.println("DAİRENİN YARIÇAPINI GİRİNİZ: ");
        r = input.nextDouble();

        System.out.println("DAİRENİN MERKEZ AÇISINI GİRİNİZ: ");
        a = input.nextDouble();

        //HESAPLAMALAR

        double dA = (pi * (r * r) * a) / 360;


        //ÇIKTILAR

        System.out.println("DİLİMİN ALANI: " + dA);





    }
}