import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ExerciseOne();
        // ExerciseTwo();
    }

    static void ExerciseOne() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 2003) {
            System.out.println("Senha inválida");
            x = sc.nextInt();
            if (x == 2003) {
                System.out.println("Senha correta!");
            }
        }

        sc.close();
    }

    static void ExerciseTwo() {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int x = sc.nextInt();

        while (x == 1) {
            System.out.println("Alcool");
            alcool++;
            x = sc.nextInt();
        }
        while (x == 2) {
            System.out.println("Gasosa");
            gasolina++;
            x = sc.nextInt();
        }
        while (x == 3) {
            System.out.println("Diesel");
            diesel++;
            x = sc.nextInt();
            if (x == 4) {
                System.out.println("Muito obrigado!");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);

            }
        }
        sc.close();
    }
}