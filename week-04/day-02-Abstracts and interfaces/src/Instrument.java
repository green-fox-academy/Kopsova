public abstract class Instrument {


    protected String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    public Instrument (String instname){
        this.name = instname;
    }

    public abstract void play();



}
