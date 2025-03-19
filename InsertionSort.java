public class InsertionSort {
    
    public static void sol(int[] arr,int N){

        for(int i=1;i<N;i++){
            int curr=arr[i];
            int prev=i-1;

//jab tk prev >=0 hai a&&  arr[prev] > curr hai tb tk left se big value right store krte rahenge
            while(prev >=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
    //insert the element
            arr[prev+1]=curr;
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
