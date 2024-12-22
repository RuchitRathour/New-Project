package Kunal.OOPs;

import Oops.Student;

public class Main1 {
    public static void main(String[] args) {
        Student1 kunal = new Student1(); // Student1() is constructor
       // kunal.rno = 13;
        //kunal.name = "Ruchit";
        //kunal.marks = 88.5f;
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);
    }
}
class Student1{
    int rno;
    String name;
    float marks;
    Student1 () { // its constructor -> special char
        this.rno = 13; // this is keyword
        this.name = "Ruchit";
        this.marks = 88.5f;
    }

}