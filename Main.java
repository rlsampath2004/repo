
class Animalparent{
    Animalparent(){
        System.out.println("Animal parent constructor called");
    }
}
class Dog extends Animalparent{
    int legs;
    String breed;
    Dog(){
        System.out.println("Dog no args constructor called");
    }
    Dog(int legs,String breed){
        this.legs=legs;
        this.breed=breed;
        System.out.println("Dog parameterized constructor called");
    }
}
public class Main extends Dog{
    Main(){
        super(4,"husky");
        System.out.println("Constructor called");
    }
    public static void main(String[] args){
        System.out.println("Main method started");
        Main m=new Main();
        m.display();
    }
    void display(){
        System.out.println(legs+" "+breed);
    }
}