import java.util.Scanner;

public class ciastka {
    public static void main(String[] args) {


        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj ilość zjedzonych ciastek: ");
        int ciastkailosc = klawiatura.nextInt();
        klawiatura.nextLine();

        int box, boxportion, calories, calorie1;
        box = 40;
        boxportion = 4;
        calories = 300;
        calorie1 = calories / boxportion ;
        System.out.println("Ilość spożytych kalorii: " + ciastkailosc * calorie1 + " kcal");
    }
}