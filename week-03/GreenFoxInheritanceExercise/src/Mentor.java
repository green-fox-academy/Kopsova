import java.security.PublicKey;

public class Mentor extends Person {
        String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor() {
        super("Pepa", 18, "male");
        this.level = level;
    }

    public Mentor(String level) {
        this.level = level;
    }

    public  void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }
public  void  introduce(){
    System.out.println("Hi, I'm" + super.name +", a " + super.age+ " year old "+ gender+ " " + level + " mentor.");
}

}
