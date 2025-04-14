abstract class Animal{
    abstract void walk();  // abstract function
}

class Horse extends Animal{
    public void walk(){
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}

public class oopAbstract {
    public static void main(String argd[]){
        Horse horse=new Horse();
        horse.walk(); //output horse walks on 4 legs

        Chicken chicken =new Chicken();
        chicken.walk(); //output  walk chickenks on 4 legs


        // Animal animal=new Animal();  // error cant instantiate mean cant create Animal object
            
        
    }
}
