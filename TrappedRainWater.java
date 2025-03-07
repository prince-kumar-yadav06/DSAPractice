import java.util.*;

public class TrappedRainWater{

    public static void TrappedWater(int height[],int N){

        // step 1 crete leftmax array
        int leftmax[]=new int[N];

        leftmax[0]=height[0];

        // store all max of leftmax and height at i index
        for(int i=1;i<N;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        
        // step 2 : create rightmax

        int rightmax[]=new int[N];

        rightmax[N-1]=height[N-1];

        // store all max of leftmax and height at i index
        for(int i=N-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }

        int TrappedWater=0;
        // step 3: find waterlevel jo leftmax aur rightmax ka min value hoga 
        for(int i=0;i<N;i++){

            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            TrappedWater=TrappedWater + waterlevel-height[i];
        }
        System.out.println(TrappedWater);
    }

    
    
    public static void main(String[] args) {
       

        int arr[]={4,2,0,6,3,0,5};

        TrappedWater(arr, arr.length);
        
}
}
