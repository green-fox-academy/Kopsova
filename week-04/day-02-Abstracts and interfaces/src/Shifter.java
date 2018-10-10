import java.util.stream.IntStream;

public class Shifter implements CharSequence {
    String a;
    int howManyToSHift;

    public Shifter(String a, int howManyToSHift) {
        this.a = a;
        this.howManyToSHift=howManyToSHift;


    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
if (howManyToSHift +index <a.length()){
        return (a.charAt(  index +  howManyToSHift  ));
    } else{
    return  a.charAt(howManyToSHift-a.length()+index);
}
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }

    public static void main (String [] args){
Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(5));

    }
}
