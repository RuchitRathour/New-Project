package Rough;
 class students{
     int id;
     int age;

     students(int id,int age){     // constructor
         this.id = id;
         this.age = age;
         System.out.println("Hello world");
     }
 }
public class Class3 {
    public static void main(String[] args) {
        students obj = new students(5,68);

    }
}