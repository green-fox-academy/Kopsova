public class String04ToDoPrint {

    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo


String begining = "My todo";
String next0 = todoText.replaceFirst("\n", "");
String next1 = " - Download games";
String last = "      - Diablo";

        System.out.println(begining);
        System.out.println(next0);
        System.out.println(next1);
        System.out.println(last);
    }
}
