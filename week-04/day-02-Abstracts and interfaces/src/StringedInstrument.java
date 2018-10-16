public abstract class StringedInstrument extends Instrument {
    private int numberOfStrings;

    public StringedInstrument() {

    }

    public StringedInstrument(String name) {
        super(name);
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public StringedInstrument(String name, int numberOfStrings) {
        super.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    public void play() {
        System.out.println(super.getName() +", a " + getNumberOfStrings()
                + "-stringed instrument, that goes "+ sound());
    }


}




