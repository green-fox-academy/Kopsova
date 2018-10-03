public class PostIt {

//    Create a PostIt class that has
//            a backgroundColor
//            a text on it
//            a textColor
//            Create a few example post-it objects:
//    an orange with blue text: "Idea 1"
//    a pink with black text: "Awesome"
//    a yellow with green text: "Superb!"
String backgroundColor;
String text;
String textColor;

public void setPostIt (String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
}

    public static void main (String [] args){
         PostIt postIt1 = new PostIt();
         postIt1.setPostIt("orange","blue", "Idea 1");

         PostIt postIt2 = new PostIt();
         postIt2.setPostIt("pink", "black", "Awesome");

         PostIt postIt3 = new PostIt();
         postIt3.setPostIt("Yellow", "green","Superb!");
    }
}


