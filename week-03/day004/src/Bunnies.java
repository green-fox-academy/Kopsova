public class Bunnies {

    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    public static void main(String[] args) {

        int bunnies = 16;
        System.out.println(ears(bunnies));
    }

    public static int ears(int x) {
        if (x == 0) {
            return x;
        }
        x = 2 + ears(x - 1);
        return x;
    }
}
