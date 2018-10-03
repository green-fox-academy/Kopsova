public class Counter {
    int field ;
    int number;


    public Counter ( ){
        this(0);
    }
    public Counter (int field){
        this.field = field;
        this.number = field;

    }

    public int add (int number){
        return field +=  number;
    }

    public void add (){

        field++;
    }
    public int get () {
        return field;
    }
    public void reset (){
      field = number ;
    }
}
