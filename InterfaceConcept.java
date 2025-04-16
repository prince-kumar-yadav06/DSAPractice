interface Animal{
    int eye =2; // its static ,fixed for all animal ,u we cant change
    public void walk(); //here walk function create
} 

class Horse implements Animal{
    public void walk(){
        System.out.println("Horse walks on 4 legs ");
    }
}

public class interfaceConcept{
    public static void main(String args[]){
        Horse hr=new Horse();
        hr.walk();
    }
}
