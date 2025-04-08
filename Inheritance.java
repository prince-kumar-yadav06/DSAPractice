 import java.util.*;
 
 class Animal{

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}
    class Fish extends Animal{
        void swim(){
            System.out.println("swim");
        }
    }
    public class Inheritance{
        public static void main(String[] args) {
            Fish ob=new Fish();

            ob.eat();
            ob.breathe();
            ob.swim();
        }
    }
        
    
