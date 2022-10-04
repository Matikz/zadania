import java.util.Scanner;

public class shop {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj cenę: ");
        int cena = klawiatura.nextInt();
        klawiatura.nextLine();

        int podateklok, podatekstan, podatki;
        podateklok = 2;
        podatekstan = 4;
        podatki = (podateklok + podatekstan + 100);
        System.out.println("cena:" +( cena * podatki ));
        System.out.println("cena bez podatków" + cena);

    }
}
