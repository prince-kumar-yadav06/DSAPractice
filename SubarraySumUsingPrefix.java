import java.util.*;

public class SubarraySum{ // Using prefix o(n^2)



    public static void Print(int arr[]){


        int maxsum=0;

      int  prefix[]=new int[arr.length];
        prefix[0]=arr[0];

        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
            for(int i=0;i<arr.length;i++){
                int start=i;

                int currSum=0;
                for(int j=i;j<arr.length;j++){
                    int end=j;
                    currSum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];

                    if(maxsum<currSum){
                        maxsum=currSum;
                    }
                }
            }
            System.out.println(maxsum);
              
            }
        
    public static void main(String[] args) {
        // int arr[]={2,4,6,8,10};
        int arr[]={1,-2,6,-1,3};
        
      Print(arr);  //T.C=O(n^3)
}
}
