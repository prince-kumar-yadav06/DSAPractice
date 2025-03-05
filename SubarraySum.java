import java.util.*;

public class SubarraySum{



    public static void Print(int arr[]){


        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;

                int currsum =0;

                for(int k=start;k<=end;k++){
                    currsum += arr[k];
                }
                maxsum = Math.max(maxsum, currsum);
              
            }
        }
        System.out.println(maxsum);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        
      Print(arr);  //T.C=O(n^3)
}
}
