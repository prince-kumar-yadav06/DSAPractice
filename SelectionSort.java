public class SelectionSort {
    
    public static void sol(int[] arr,int N){

        for(int i=0;i<N;i++){

            int minpos=i;
            for(int j=i+1;j<N;j++){

                if(arr[minpos] > arr[j]){
                  minpos=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minpos];
            arr[minpos]=temp;
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
