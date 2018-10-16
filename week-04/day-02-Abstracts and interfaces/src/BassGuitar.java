public class BassGuitar extends StringedInstrument{


    public BassGuitar() {
        super("Bass Guitar", 4);
    }

    public BassGuitar(int i) {
        super("Bassguitar");
    }


    @Override
    public String sound() {
        return "Duum-duum-duum";
    }

//    @Override
//    public void play() {
//
//
//    }
}
