public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width, float inkAmount){
    this.color = color;
    this.width = width;
    this.inkAmount = inkAmount;
}

   public Sharpie() {
        this("",0,0);

   }

    public  void createSharpie (String color, float width){
    Sharpie sharpie = new Sharpie();
    sharpie.color = color;
    sharpie.width = width;
    sharpie.inkAmount = 100;
}
public static void use (Sharpie sharpie){
    sharpie.inkAmount--;
}



}
