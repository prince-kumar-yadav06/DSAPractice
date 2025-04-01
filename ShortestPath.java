import java.util.*;

public class ShortestPath{

   public static double FindShortestPath(String str){

    int x=0,y=0;

    for(int i=0;i<str.length();i++){
        char direction=str.charAt(i);

        // for east direction 
        if(direction == 'E'){
            x++;
        }

         // for west direction 
         if(direction == 'W'){
            x--;
        }

         // for north direction 
         if(direction == 'N'){
            y++;
        }

         // for south direction 
         if(direction == 'S'){
            y--;
        }
    }
    int x2=x*x;
    int y2=y*y;

    double ans=(Math.sqrt(x2+y2));
    return (ans);
   
    }
   
    public static void main(String args[]){

      String str="wneenesennn";

      System.out.println(ShortestPath(str.toUpperCase()));
     
    }
}
