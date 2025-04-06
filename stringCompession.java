import java.util.*;

public class stringCompession {

    public static void main(String args[]){
        
        // String str="aaabbccddd";
        String str="abc";

        String newstr="";

        for(int i=0;i<str.length();i++){
            int counter=1;
            while(i<str.length()-1 && str.charAt(i) ==str.charAt(i+1)){
                counter++;
                i++;
            }
            newstr += str.charAt(i);
            if(counter>1){
                newstr +=Integer.toString(counter);
            }
        }
        System.out.println(newstr);
}
}
