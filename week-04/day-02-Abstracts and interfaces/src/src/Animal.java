public class Animal {
    String name;
    int age;


     Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
//chci getter jenom na name, age chci verejny

    public String getName() {
        return name;
    }
    public int getAge(){
         return age;
    }


}
