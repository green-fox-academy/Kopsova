public class Fibonacci {




    public int fibb(int f) {

            if (f <=1) {
                return f;
            } else {
                f= fibb(f - 1) + fibb(f - 2);
            }

        return f;
    }
}
