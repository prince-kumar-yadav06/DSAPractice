import java.util.*;
public class CountSorting{
    
    public static void sol(int[] arr,int N){


        // step 1 find max element
         
         int max=0;

         for(int i=0;i<N;i++){
            max=Math.max(arr[i],max);
         }

        //  step 2 create count array
        int count[]=new int[max+1];

        // step initialize count with 0

        for(int i=0;i<max+1;i++){
            count[i]=0;
        }
        // step 4 count occurence of element and store in count 
        for(int i=0;i<N;i++){
        count[arr[i]] =count[arr[i]]+1;
        }

       

        int i=0;   //for count index
        int j=0;  //to store element in sortedArray

        while(i <=max){

            if(count[i]>0){
                arr[j]=i;
                count[i]=count[i]-1;
                j++;
            }
            else{
                i++;
            }
        }

        for(int k=0;k<N;k++){
            System.out.print(arr[k]+",");
        }
    }

    public static void main(String args[]){

        int []arr={5,4,1,3,2,1,3,7,2,5,2,4};

        sol(arr, arr.length);

      
    }
}
