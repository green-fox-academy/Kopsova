public class Exercise12_Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000


        int a = 2;
        int b = 3;
        int c = 5;


        int v = a * b * c;

        int s = 2 * ((a * b) + (b * a) + (a * c));
        System.out.println("Surface area: " + s);
        System.out.println("Volume: " + v);

    }
}





