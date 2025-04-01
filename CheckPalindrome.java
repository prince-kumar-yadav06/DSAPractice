import java.util.Scanner;

public class CheckPalindrome{

   public static Boolean Palindrome(String str){

    int st=0;
    int end=str.length()-1;

    while(st <=end){
        if(str.charAt(st) != str.charAt(end)){
            return false;
        }
        else if(str.charAt(st) == str.charAt(end)){

            st++;
            end--;
        }
    }
    return true;
    }
   
    public static void main(String args[]){

      String str="sir";

      if(Palindrome(str)){
        System.out.println("palindrome");
      }
      else{
        System.out.println("not palindrome");
      }
    }
}
