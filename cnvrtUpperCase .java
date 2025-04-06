import java.util.*;

public class cnvrtUpperCase {

    public static void main(String args[]){
        StringBuilder str=new StringBuilder("Hi I aM PriNce");

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(Character.isLowerCase(ch)){
                char ch1=Character.toUpperCase(ch);
                str.setCharAt(i, ch1);
            }
            else if(ch== ' '){
                str.setCharAt(i, ch);
            }
                else{
                char ch1=Character.toLowerCase(ch);

                    str.setCharAt(i, ch1);
                }
            }
           System.out.println(str);
    }
}
