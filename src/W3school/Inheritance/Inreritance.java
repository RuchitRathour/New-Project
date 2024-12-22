package W3school.Inheritance;

class parentClass {
    void display(){
        System.out.println("Parent class method");
    }
}
class childClass extends parentClass{
    void show(){
        System.out.println("Child class method");
    }
}
public class Inreritance {
    public static void main(String[] args) {
        childClass child1 = new childClass();  // object
        child1.display();
        System.out.println();                       
        child1.show();
    }
}
