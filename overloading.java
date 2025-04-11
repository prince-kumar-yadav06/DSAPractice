public class overloading {
    static int sum(int a,int b){
        return a+b;
    }
   static Double sum(Double a , Double b){
        return a+b;
    }


    public static void main(String[] args) {
        System.out.println(sum(10,12));
        System.out.println(sum(10.2,10.2));
    }
}
