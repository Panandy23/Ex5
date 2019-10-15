import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double a, b, c;
        double x1, x2;
        double delta;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Podaj zmienną a: ");
        a = scanner.nextDouble();
        System.out.println("Podaj zmienną b: ");
        b = scanner.nextDouble();
        System.out.println("Podaj zmienną c: ");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4*a*c;

        System.out.printf("Delta wynosi: " + "%2.2f", delta);
        System.out.println(" ");

        if (delta < 0){

            System.out.println("Brak miejsc zerowych funkcji");

        } else if (delta == 0){

            x1 = -b / 2*a;

            System.out.printf("Funkcja ma jedno miejsce zerowe x1 = " + "%2.2f", x1);

        } else {

            x1 = (-b - Math.sqrt(delta))/2*a;
            x2 = (-b + Math.sqrt(delta))/2*a;

            System.out.println("Funkcja ma dwa miejsca zerowe: ");
            System.out.printf("x1 = " + "%2.2f", x1);
            System.out.printf(" ,x2 = " + "%2.2f", x2);

        }


    }
}
