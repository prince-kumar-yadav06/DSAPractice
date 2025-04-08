 class Constructer {
    
    String name;
        int age;
        
        Constructer(String newname,int newAge){
            this.name=newname;
            this.age=newAge;
        }
        
    }
    public class oopConstructer {
    public static void main(String[] args) {
    
        Constructer ob=new Constructer("khushi",20);
        System.out.println(ob.name);
        System.out.println(ob.age);
    }

    
}
