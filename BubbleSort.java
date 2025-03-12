public class BubbleSort {
    
    public static void sol(int[] arr,int N){

        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                if(arr[j] > arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                }

            }
        }
    }

    public static void main(String args[]){

        int []arr={5,4,1,3,2};

        sol(arr, arr.length);

        for(int i=0;i<arr.length;i++){
        System.err.print(arr[i]+",");
        }
    }
}
