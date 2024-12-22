package W3school.ConstructorGeeksforGeeks;
 class Students{
     int id;
     int age;
     Students(int id,int age){  // parameter constructor
         this.id = id;
         this.age = age;
         System.out.println("Hello");
     }
 }
public class Class1 {
    public static void main(String[] args) {
        Students obj = new Students(5,68);
       //System.out.println("ID:"+obj.age+"and"+obj.id);
    }

}
