import java.util.HashSet;
import java.util.Iterator;

public class Abstraction {
    public static void main(String[] args) {
        Integer s1[] = {1,2,3,1,2,3};
        HashSet s = new HashSet<>();
        //s.add();
        Iterator it = s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

       // h.speak();
        // h.swim();
        
       System.out.println( s);
    }
    
}
 abstract class Animal {
    String color;
    Animal(){
        System.out.println("called");
    }
    void walk(){
        System.out.println("walks");
    }
    abstract void speak();
        //System.out.println("eats");
    

 }
 class human extends Animal{
     void speak(){
         System.out.println("speaks");
     }
 }
 abstract class Fish extends Animal{
    void speak(){
        System.out.println("can`t");

    }
    abstract String swim();

 }
 class horse extends Fish{
    horse(){
        super.color = "yellow";
        System.out.println("also called");
    }
    String swim(){
        System.out.println("swims");
       return "swims";
    }
    void runFast(){
        System.out.println("runFst");
    }
 }

