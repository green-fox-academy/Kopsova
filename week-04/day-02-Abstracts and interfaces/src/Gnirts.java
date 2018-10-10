import javafx.util.StringConverter;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    String s;

    public Gnirts(String s) {
        this.s = s;
    }

    @Override
    public int length() {
        return s.length();
    }



    @Override
    public char charAt(int index) {
        return s.charAt(length() - index);
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

    public static void main (String[] args){
        Gnirts gnirt = new Gnirts("Helooooo");
        System.out.println(gnirt.charAt(1));

    }
}
