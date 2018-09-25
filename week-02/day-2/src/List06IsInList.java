import java.util.*;

public class List06IsInList{
        public static void main(String... args){
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 12, 8, 10, 14, 16));
            checkNums(list);
            System.out.println(checkNums(list));
            // Check if list contains all of the following elements: 4,8,12,16
            // Create a method that accepts list as an input
            // it should return "true" if it contains all, otherwise "false"

        }
        public static Boolean checkNums (ArrayList<Integer> list){
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,8,12,16));

           return (list.containsAll(list2));

            }


        }

