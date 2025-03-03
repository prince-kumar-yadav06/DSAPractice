public class LinearSearch{

    public static void ReverseARR(int arr[]){  // T.C=O(n)

        int start=0;
        int end=arr.length-1;

        while(start <= end){
           //Swap
          int temp= arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;

        }

    }

    
    public static void main(String[] args) {
        int arr[]={2,3,8,13};
        
        ReverseARR(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
}
}
