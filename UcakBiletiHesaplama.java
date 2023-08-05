import java.util.Scanner;

public class UcakBiletiHesaplama {

    public static void main(String[] args) {
        // Km birim fiyatı 0,10$
        // Yolcu 12 yaşından küçükse %50 indirim
        // Yolcu 12 ile 24 yaş arasında ise %10 indirim
        // yolcu 65 yaşından büyükse %30 indirim
        // Gidiş - Dönüş bileti alınırsa %20 indirim daha yapılır hepsine ek olarak

        Scanner scan = new Scanner(System.in);
        int distance, age,  type;
        System.out.println("Please input distance : ");
        distance = scan.nextInt();
        System.out.println("Please input your age : ");
        age = scan.nextInt();
        System.out.print("Please choose your trip type ( 1=One way ticket, 2=Round trip ) :");
        type = scan.nextInt();

        double standartPrice, ageDiscount, typeDiscount;

        if (distance > 0 && age > 0 && (type==1 || type==2)) {
            standartPrice = distance * 0.10;

            if (age < 12) {
                ageDiscount = standartPrice * 0.50;

            } else if (age<= 24) {
                ageDiscount = standartPrice * 0.10;

            } else if (age >= 65) {
                ageDiscount = standartPrice * 0.30;

            } else {
                ageDiscount = 0;
            }
            standartPrice -= ageDiscount;

            if (type == 2) {
                typeDiscount = standartPrice * 0.20;
                standartPrice = (standartPrice - typeDiscount) * 2;
            }

            System.out.println(" Ticket Price : " + standartPrice + "$");

        } else { System.out.println("You have entered an invalid value. Please try again" );
        }

    }
}
