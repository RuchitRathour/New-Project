package Rough;
 class Geek{
     String name;
     int id;

     Geek(String name,int id){
         this.name = name;
         this.id = id;
     }
 }
public class Class4 {
    public static void main(String[] args) {
        Geek geek1 = new Geek("Avinash",68);
        System.out.println("GeekName:"+geek1.name+"and GeekId:"+geek1.id);

    }
}
