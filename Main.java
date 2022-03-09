import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // :)

        // ExerciseOne;
        // ExerciseTwo;
        // ExerciseThree();
    }

    static void ExerciseOne() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    static void ExerciseTwo() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }

            System.out.println(in + " in");
            System.out.println(out + " out");
        }

        sc.close();
    }

    static void ExerciseThree() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10;

            System.out.printf("%.1f%n", media);

        }
        sc.close();
    }

}