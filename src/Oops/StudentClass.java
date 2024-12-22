package Oops;

public class StudentClass {
    // creating a new data type or class
    public static class Student{ //class
         String name;
        int rno;
        double percent;
    }
    public static void main(String[] args) {
       Student x = new Student(); // object
        x.name = "Ruchit";
        x.rno = 76;
        x.percent = 92.5;
        System.out.println(x.name);
        
        Student s = new Student();
        s.name = "Rohan";
        s.rno = 77;
        s.percent = 93.5;


    }
}
