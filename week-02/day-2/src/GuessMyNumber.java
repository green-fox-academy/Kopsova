import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args) {

        System.out.println("Zadej v jakém rozsahu mám vybrat číslo");
        System.out.println("od kolika?");
        Scanner scanner = new Scanner(System.in);
        int from = scanner.nextInt();

        System.out.println("do kolika?");
        int to = scanner.nextInt();

        int number = (int) ((Math.random() * (to-from +1) + from));
        int lifes = 5;
        System.out.println(number);

        System.out.println("Myslím si číslo. Máš " + lifes + " životů. Hádej:");

        for (int i = 0; i < 5; i++) {
            int guess = scanner.nextInt();
            lifes--;
            if (guess == number) {
                System.out.println(" Gratuluji, vyhrál jsi, to je správné číslo."); System.exit(0);
            } else if (guess > number) {
                System.out.println("To je moc.  Máš " + lifes + " životů. Hádej znova:");
            } else if (guess < number) {
                System.out.println("To je málo.  Máš " + lifes + " životů. Hádej znova:");
            }
        }
        System.out.println("Bohužel jsi ztratil všechny životy. Jestli chceš hádat dál, " +
                "napiš kolik chceš dalších životů:");
        int nextLifes = scanner.nextInt();
        for (int i = 0; i < nextLifes; i++) {
            int guess = scanner.nextInt();
            nextLifes--;
            if (guess == number) {
                System.out.println(" Gratuluji, vyhrál jsi, to je správné číslo.");System.exit(0);
            } else if (guess > number) {
                System.out.println("To je moc.  Máš " + lifes + " životů. Hádej znova:");
            } else if (guess < number) {
                System.out.println("To je málo.  Máš " + lifes + " životů. Hádej znova:");
            }
        }

        System.out.println("Bohužel jsi prohrál, konec hry.");
    }
}
