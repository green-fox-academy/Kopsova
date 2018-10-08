import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;

public class Cohort {

    String name;
    List students;
    List mentors;

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList  <> ();
        mentors = new ArrayList <> ();


    }

    public Cohort () {
        this.name = "";
        students = new ArrayList  <> ();
        mentors = new ArrayList <> ();

    }

    public void addStudent ( Student student){
        students.add(student);
    }

    public void addMentor (Mentor mentor) {
        mentors.add(mentor);
    }
 public void info (){
     System.out.println("The "+ name + " cohort has " + students.size()+" students and " + mentors.size() + " mentors.");
 }

}
