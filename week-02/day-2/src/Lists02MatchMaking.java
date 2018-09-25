import java.util.*;
public class Lists02MatchMaking {

    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }


        public static ArrayList makingMatches (ArrayList<String> girls, ArrayList<String> boys){

            ArrayList<String> together = new ArrayList<String>();



            for (int i = 0; i < girls.size(); i++) {

                together.add(i * 2, girls.get(i));

                together.add(i * 2 + 1, boys.get(i));

            }
            for (int i = girls.size(); i < boys.size() ; i++) {

                together.add(i*2, boys.get(i));

            }

            return together;

        }




    }

