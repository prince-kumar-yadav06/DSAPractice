public class LinearSearch{

    
    public static void main(String[] args) {
        int arr[]={2,3,5,2,8,1,7,13};
        int key=8;
        
    for(int i=0;i<arr.length;i++){
        if(arr[i]==key){
            System.out.println(i);
            break;
        }
    }
}
}
