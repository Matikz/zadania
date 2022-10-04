import java.util.Scanner;

public class fuel {
    public static void main(String[] args){
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ilość przejechanych kilometrów: ");
        int kmprzejechane = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("Podaj ilość spalonego paliwa: ");
        double fuelspalone = klawiatura.nextDouble();
        klawiatura.nextLine();

        System.out.println("liczba kilometrów przejechanych na litrze: "
                + kmprzejechane / fuelspalone + "km");

    }
}
