public class spiralMatrix {
    
    public static void PrintSpiral(int arr[][]){

        int stRow=0;
        int stCol=0;
        int EndRow=arr.length-1;
        int EndCol=arr[0].length-1;

        while(stRow <= EndRow && stCol <= EndCol){

            // top
            for(int i=stCol;i<=EndCol;i++){
                System.out.print(arr[stRow][i]);
            }
            
                    //right
                        for(int i=stRow+1;i<=EndRow;i++){
                            System.out.print(arr[i][EndCol]);           
                    }
                    
                                // bottom
                                for(int i=EndCol-1;i>=stCol;i--){
                                    if(stRow==EndRow){
                                        break;
                                    }
                                    System.out.print(arr[EndRow][i]);           
                            }
            // left

            for(int i=EndRow-1;i>=stRow+1;i--){
                if(stCol==EndCol){
                    break;
                }
                System.out.print(arr[i][stCol]);
            }

        stRow++;
        stCol++;
        EndRow--;
        EndCol--;
    }
}
    public static void main(String args[]){

        int arr[][]={{1,2,3,4,5,6,7},
                    {8,9,10,11,12,13,14},
                    {15,16,17,18,19,20,21}};


                    PrintSpiral(arr);
    }
}
