public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width, float inkAmount){
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
}

   public Sharpie(String color, float width) {
        this( color, width,100);

   }
public void use (){
    inkAmount--;
}

    public void print (){
        System.out.println("color="+color+", width="+width+", inkAmount="+inkAmount);
    }

}
