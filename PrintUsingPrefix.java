public class SubarrPrint{

    public static void Print(int arr[]){  // using prefix

      int prefix[]=new int[arr.length];

      prefix[0]=arr[0];

      
      int maxsum=0;

      // prefix me sum store kre jis index pr hai waha tk ka
      for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]+arr[i];
      }

      for(int i=0;i<arr.length;i++){
          int start=i;
          int currsum=0;

        for(int j=i;j<arr.length;j++){
            int end=j;

            // agar start 0 hai to currsum prefix ka j index hoga nhi to prefix ka j index - prefix ka start se phle ka
    currsum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];

    if(maxsum < currsum){
        maxsum=currsum;
}
        }
      }
      System.out.println(maxsum);
    }

    
    public static void main(String[] args) {
        int arr[]={1,2,3};
        
      Print(arr);  //T.C=O(n^2)
}
}
