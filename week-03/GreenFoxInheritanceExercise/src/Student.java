public class Student extends Person implements Cloneable {
   String previousOrganisation;
   int skippedDays;


    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }

    public Student(String previousOrganisation) {
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;
    }
    public Student(){

        super("Pepa", 15, "male");
        this.previousOrganisation = previousOrganisation;
        this.skippedDays = 0;

    }

    public  void getGoal(){
       System.out.println("Be a junior software developer");
   }


   public  void introduce (){
       System.out.println("Hi, I am: " + name + ",a " + age + "year old" + gender + "from " + previousOrganisation +
               ", who skipped " + skippedDays + "days from the course already." );
   }

   public int skipDays ( int days){
      return  skippedDays = days + skippedDays;
   }

    @Override
    protected Object clone() {
        return new Student(name, age, gender, previousOrganisation);
    }
}



