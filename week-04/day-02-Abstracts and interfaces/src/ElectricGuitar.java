public class ElectricGuitar extends StringedInstrument {


    public ElectricGuitar() {
        super("Electric Guitar", 6);
    }

    public ElectricGuitar(int i) {
        super("Electric Guitar");
    }

    @Override
    public String sound() {
        return "Twang";
    }

//    @Override
//    public void play() {
//        System.out.println(this.name +", a " + getNumberOfStrings()
//                + "-stringed instrument, that goes "+ sound());
//
//    }
}
